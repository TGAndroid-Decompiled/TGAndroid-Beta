package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nd3 implements Runnable {
    public final byte a;
    public final sd3 b;

    public nd3(sd3 sd3Var, byte b) {
        this.a = b;
        this.b = sd3Var;
    }

    @Override
    public final void run() {
        Context context;
        boolean z;
        CharSequence charSequence;
        byte b = this.a;
        sd3 sd3Var = this.b;
        boolean z2 = false;
        switch (b) {
            case 0:
                sd3Var.d1(false);
                return;
            default:
                Context context2 = sd3Var.getContext();
                wjb wjbVar = sd3Var.J0;
                int i = sd3Var.a;
                long j = sd3Var.l2;
                ArrayList<Long> arrayList = sd3Var.m2.joined_chat_ids;
                od3 od3Var = new od3(sd3Var, (byte) 5);
                Pattern pattern = ij.a;
                LinearLayout j2 = de9.j(context2, 1);
                hd[] hdVarArr = new hd[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context2);
                String M0 = k96.M0(2131751947, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = gl.S2(k96.G(arrayList.size(), "CommunityBanWillRemoveFromChats", cf3.r(i, j)));
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.n(j2);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Long l = arrayList.get(i2);
                    i2++;
                    Long l2 = l;
                    hd hdVar2 = hdVar;
                    long longValue = l2.longValue();
                    TLRPC.Chat K0 = na7.q1(i).K0(l2);
                    TLRPC.ChatFull L0 = na7.q1(i).L0(longValue);
                    if (K0 == null) {
                        hdVar = hdVar2;
                    } else {
                        eb0 eb0Var = new eb0(wjbVar, context2, z2);
                        int i3 = size;
                        ((TextView) eb0Var.c).setText(cf3.l(K0));
                        TextView textView = (TextView) eb0Var.d;
                        if (L0 != null) {
                            context = context2;
                            z = false;
                            charSequence = k96.G(L0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((be0) eb0Var.b).f(K0, new pb0(K0));
                        eb0Var.setBackground(bkb.L0(z));
                        eb0Var.setOnClickListener(new fg(hdVarArr, od3Var, longValue, (byte) 1));
                        j2.addView(eb0Var, nme.o(-1, -2));
                        hdVar = hdVar2;
                        z2 = z;
                        context2 = context;
                        size = i3;
                    }
                }
                hd hdVar3 = hdVar;
                hdVarArr[z2 ? 1 : 0] = hdVar3;
                hdVar3.show();
                return;
        }
    }
}
