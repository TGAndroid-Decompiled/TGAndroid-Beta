package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wxb implements f59 {
    public final zxb a;

    public wxb(zxb zxbVar) {
        this.a = zxbVar;
    }

    @Override
    public final void g(int i, View view) {
        zxb zxbVar = this.a;
        ArrayList arrayList = zxbVar.d;
        if (((yxb) arrayList.get(i)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -zxbVar.c);
            bundle.putBoolean("for_select", true);
            sxb sxbVar = new sxb(bundle);
            sxbVar.B0 = zxbVar.e;
            sxbVar.w = new txb(this);
            zxbVar.presentFragment(sxbVar);
        }
        if (((yxb) arrayList.get(i)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((yxb) arrayList.get(i)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", zxbVar.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            st8 st8Var = new st8(bundle2, null);
            st8Var.s = new vxb(this, tL_forumTopic);
            zxbVar.presentFragment(st8Var);
        }
        if (((yxb) arrayList.get(i)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxbVar.getParentActivity());
            String M0 = jb6.M0(2131747646, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131747647, null);
            alertDialog$Builder.j(jb6.M0(2131751535, null), new txb(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            zxbVar.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }
}
