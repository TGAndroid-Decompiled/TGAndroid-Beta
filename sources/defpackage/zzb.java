package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
public final class zzb extends e {
    public xzb a;
    public d79 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public final void Y(int i) {
        wp7 wp7Var = getNotificationsController().h0;
        wp7Var.getClass();
        String p = ip7.p(this.c, i, true);
        SharedPreferences.Editor edit = wp7Var.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + p);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + p);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + p);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + p);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + p);
        remove5.remove("stories_" + p).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = getMessagesController().j1(this.c);
        tL_inputNotifyForumTopic.top_msg_id = i;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        getConnectionsManager().sendRequest(updatenotifysettings, new xe2((byte) 0));
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
        arrayList2.add(new yzb(1, null));
        ArrayList l = getMessagesController().g4.l(-this.c);
        int i = 0;
        if (l != null) {
            int i2 = 0;
            while (i < l.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList2.add(new yzb(2, (TLRPC.TL_forumTopic) l.get(i)));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            arrayList2.add(new yzb(3, null));
            arrayList2.add(new yzb(4, null));
        }
        arrayList2.add(new yzb(3, null));
        xzb xzbVar = this.a;
        if (xzbVar != null) {
            xzbVar.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 23));
        this.simpleActionBar.setTitle(ob6.M0(2131747639, null));
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        zb3 zb3Var = new zb3();
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        this.b.setLayoutManager(new x46());
        d79 d79Var2 = this.b;
        xzb xzbVar = new xzb(this);
        this.a = xzbVar;
        d79Var2.setAdapter(xzbVar);
        this.b.setOnItemClickListener(new wzb(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
