package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ze3 implements Runnable {
    public final byte a;
    public final ef3 b;

    public ze3(ef3 ef3Var, byte b) {
        this.a = b;
        this.b = ef3Var;
    }

    @Override
    public final void run() {
        Context context;
        boolean z;
        CharSequence charSequence;
        byte b = this.a;
        ef3 ef3Var = this.b;
        boolean z2 = false;
        switch (b) {
            case 0:
                ef3Var.d1(false);
                return;
            default:
                Context context2 = ef3Var.getContext();
                ylb ylbVar = ef3Var.J0;
                int i = ef3Var.a;
                long j = ef3Var.l2;
                ArrayList<Long> arrayList = ef3Var.m2.joined_chat_ids;
                af3 af3Var = new af3(ef3Var, (byte) 5);
                Pattern pattern = ik.a;
                LinearLayout i2 = hg9.i(context2, 1);
                he[] heVarArr = new he[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context2);
                String M0 = jb6.M0(2131751896, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = gm.S2(jb6.G(arrayList.size(), "CommunityBanWillRemoveFromChats", pg3.r(i, j)));
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.n(i2);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Long l = arrayList.get(i3);
                    i3++;
                    Long l2 = l;
                    he heVar2 = heVar;
                    long longValue = l2.longValue();
                    TLRPC.Chat L0 = oc7.r1(i).L0(l2);
                    TLRPC.ChatFull M02 = oc7.r1(i).M0(longValue);
                    if (L0 == null) {
                        heVar = heVar2;
                    } else {
                        ec0 ec0Var = new ec0(ylbVar, context2, z2);
                        int i4 = size;
                        ((TextView) ec0Var.c).setText(pg3.l(L0));
                        TextView textView = (TextView) ec0Var.d;
                        if (M02 != null) {
                            context = context2;
                            z = false;
                            charSequence = jb6.G(M02.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((bf0) ec0Var.b).f(L0, new pc0(L0));
                        ec0Var.setBackground(cmb.L0(z));
                        ec0Var.setOnClickListener(new fh(heVarArr, af3Var, longValue, (byte) 1));
                        i2.addView(ec0Var, qoe.o(-1, -2));
                        heVar = heVar2;
                        z2 = z;
                        context2 = context;
                        size = i4;
                    }
                }
                he heVar3 = heVar;
                heVarArr[z2 ? 1 : 0] = heVar3;
                heVar3.show();
                return;
        }
    }
}
