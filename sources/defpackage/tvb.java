package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tvb implements c39 {
    public final wvb a;

    public tvb(wvb wvbVar) {
        this.a = wvbVar;
    }

    @Override
    public final void d(int i, View view) {
        wvb wvbVar = this.a;
        ArrayList arrayList = wvbVar.d;
        if (((vvb) arrayList.get(i)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -wvbVar.c);
            bundle.putBoolean("for_select", true);
            qvb qvbVar = new qvb(bundle);
            qvbVar.B0 = wvbVar.e;
            qvbVar.w = new rvb(this);
            wvbVar.presentFragment(qvbVar);
        }
        if (((vvb) arrayList.get(i)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((vvb) arrayList.get(i)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", wvbVar.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            pr8 pr8Var = new pr8(bundle2, null);
            pr8Var.s = new svb(this, tL_forumTopic);
            wvbVar.presentFragment(pr8Var);
        }
        if (((vvb) arrayList.get(i)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wvbVar.getParentActivity());
            String M0 = k96.M0(2131747720, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131747721, null);
            alertDialog$Builder.j(k96.M0(2131751586, null), new rvb(this));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            wvbVar.showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }
}
