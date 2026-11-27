package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ge3 implements Runnable {
    public final byte a;
    public final me3 b;

    public ge3(me3 me3Var, byte b) {
        this.a = b;
        this.b = me3Var;
    }

    @Override
    public final void run() {
        Context context;
        boolean z;
        CharSequence charSequence;
        byte b = this.a;
        me3 me3Var = this.b;
        boolean z2 = false;
        switch (b) {
            case 0:
                me3Var.e1(false);
                return;
            default:
                Context context2 = me3Var.getContext();
                vnb vnbVar = me3Var.J0;
                int i = me3Var.a;
                long j = me3Var.l2;
                ArrayList<Long> arrayList = me3Var.m2.joined_chat_ids;
                he3 he3Var = new he3(me3Var, (byte) 5);
                Pattern pattern = jj.a;
                LinearLayout j2 = uh9.j(context2, 1);
                id[] idVarArr = new id[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context2);
                String M0 = ob6.M0(2131751924, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = hl.S2(ob6.G(arrayList.size(), "CommunityBanWillRemoveFromChats", wf3.r(i, j)));
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.n(j2);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Long l = arrayList.get(i2);
                    i2++;
                    Long l2 = l;
                    id idVar2 = idVar;
                    long longValue = l2.longValue();
                    TLRPC.Chat M02 = uc7.s1(i).M0(l2);
                    TLRPC.ChatFull N0 = uc7.s1(i).N0(longValue);
                    if (M02 == null) {
                        idVar = idVar2;
                    } else {
                        gb0 gb0Var = new gb0(vnbVar, context2, z2);
                        int i3 = size;
                        ((TextView) gb0Var.c).setText(wf3.l(M02));
                        TextView textView = (TextView) gb0Var.d;
                        if (N0 != null) {
                            context = context2;
                            z = false;
                            charSequence = ob6.G(N0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((de0) gb0Var.b).f(M02, new rb0(M02));
                        gb0Var.setBackground(aob.L0(z));
                        gb0Var.setOnClickListener(new dg(idVarArr, he3Var, longValue, (byte) 1));
                        j2.addView(gb0Var, tre.o(-1, -2));
                        idVar = idVar2;
                        z2 = z;
                        context2 = context;
                        size = i3;
                    }
                }
                id idVar3 = idVar;
                idVarArr[z2 ? 1 : 0] = idVar3;
                idVar3.show();
                return;
        }
    }
}
