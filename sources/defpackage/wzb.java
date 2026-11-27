package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wzb implements r69 {
    public final zzb a;

    public wzb(zzb zzbVar) {
        this.a = zzbVar;
    }

    @Override
    public final void e(int i, View view) {
        zzb zzbVar = this.a;
        ArrayList arrayList = zzbVar.d;
        if (((yzb) arrayList.get(i)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -zzbVar.c);
            bundle.putBoolean("for_select", true);
            tzb tzbVar = new tzb(bundle);
            tzbVar.B0 = zzbVar.e;
            tzbVar.w = new uzb(this);
            zzbVar.presentFragment(tzbVar);
        }
        if (((yzb) arrayList.get(i)).a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((yzb) arrayList.get(i)).c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", zzbVar.c);
            bundle2.putLong("topic_id", tL_forumTopic.id);
            bundle2.putBoolean("exception", false);
            zu8 zu8Var = new zu8(bundle2, null);
            zu8Var.s = new vzb(this, tL_forumTopic);
            zzbVar.presentFragment(zu8Var);
        }
        if (((yzb) arrayList.get(i)).a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zzbVar.getParentActivity());
            String M0 = ob6.M0(2131747640, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131747641, null);
            alertDialog$Builder.j(ob6.M0(2131751563, null), new uzb(this));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            zzbVar.showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }
}
