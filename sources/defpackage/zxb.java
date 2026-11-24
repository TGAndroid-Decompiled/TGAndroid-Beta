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
public final class zxb extends d {
    public xxb a;
    public r59 b;
    public long c;
    public ArrayList d;
    public HashSet e;

    public final void Z(int i) {
        ap7 ap7Var = getNotificationsController().h0;
        ap7Var.getClass();
        String p = lo7.p(this.c, i, true);
        SharedPreferences.Editor edit = ap7Var.b().edit();
        SharedPreferences.Editor remove = edit.remove("notify2_" + p);
        SharedPreferences.Editor remove2 = remove.remove("custom_" + p);
        SharedPreferences.Editor remove3 = remove2.remove("notifyuntil_" + p);
        SharedPreferences.Editor remove4 = remove3.remove("content_preview_" + p);
        SharedPreferences.Editor remove5 = remove4.remove("silent_" + p);
        remove5.remove("stories_" + p).apply();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
        tL_inputNotifyForumTopic.peer = getMessagesController().i1(this.c);
        tL_inputNotifyForumTopic.top_msg_id = i;
        updatenotifysettings.peer = tL_inputNotifyForumTopic;
        getConnectionsManager().sendRequest(updatenotifysettings, new nf2((byte) 0));
    }

    public final void a0() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        if (!this.isPaused && this.a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new yxb(1, null));
        ArrayList l = getMessagesController().g4.l(-this.c);
        int i = 0;
        if (l != null) {
            int i2 = 0;
            while (i < l.size()) {
                if (this.e.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList2.add(new yxb(2, (TLRPC.TL_forumTopic) l.get(i)));
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i != 0) {
            arrayList2.add(new yxb(3, null));
            arrayList2.add(new yxb(4, null));
        }
        arrayList2.add(new yxb(3, null));
        xxb xxbVar = this.a;
        if (xxbVar != null) {
            xxbVar.E(arrayList, arrayList2);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 22));
        this.simpleActionBar.setTitle(jb6.M0(2131747645, null));
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        sc3 sc3Var = new sc3();
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        this.b.setLayoutManager(new u46());
        r59 r59Var2 = this.b;
        xxb xxbVar = new xxb(this);
        this.a = xxbVar;
        r59Var2.setAdapter(xxbVar);
        this.b.setOnItemClickListener(new wxb(this));
        frameLayout.addView(this.b);
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.c = this.arguments.getLong("dialog_id");
        a0();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
