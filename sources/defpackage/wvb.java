package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
public final class wvb extends d {
    public uvb a;
    public o39 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public final void Y(int i) {
        wm7 wm7Var = getNotificationsController().h0;
        wm7Var.getClass();
        String p = im7.p(this.c, i, true);
        SharedPreferences.Editor edit = wm7Var.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + p);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + p);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + p);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + p);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + p);
        remove5.remove("stories_" + p).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = getMessagesController().h1(this.c);
        tL_inputNotifyForumTopic.top_msg_id = i;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        getConnectionsManager().sendRequest(updatenotifysettings, new ce2((byte) 0));
    }

    public final void Z() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new vvb(1, null));
        ArrayList l = getMessagesController().g4.l(-this.c);
        int i = 0;
        if (l != null) {
            int i2 = 0;
            while (i < l.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList2.add(new vvb(2, (TLRPC.TL_forumTopic) l.get(i)));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            arrayList2.add(new vvb(3, null));
            arrayList2.add(new vvb(4, null));
        }
        arrayList2.add(new vvb(3, null));
        uvb uvbVar = this.a;
        if (uvbVar != null) {
            uvbVar.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 21));
        this.simpleActionBar.setTitle(k96.M0(2131747719, null));
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.C = false;
        gb3Var.m = false;
        this.b.setItemAnimator(gb3Var);
        this.b.setLayoutManager(new t26());
        o39 o39Var2 = this.b;
        uvb uvbVar = new uvb(this);
        this.a = uvbVar;
        o39Var2.setAdapter(uvbVar);
        this.b.setOnItemClickListener(new tvb(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
