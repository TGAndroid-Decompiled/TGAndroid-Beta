package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class xm7 extends c6 {
    public final Context a;
    public final an7 b;

    public xm7(an7 an7Var, Context context) {
        this.b = an7Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        pha phaVar;
        an7 an7Var = this.b;
        wjb wjbVar = an7Var.f;
        SparseArray sparseArray = an7Var.J;
        if (i == -1) {
            phaVar = ((d) an7Var).simpleActionBar;
            if (phaVar.x()) {
                an7Var.c0();
                return;
            } else {
                an7Var.finishFragment();
                return;
            }
        }
        if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, an7Var.getParentActivity());
            String G = k96.G(sparseArray.size(), "DeleteTones", new Object[0]);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = G;
            hdVar.U = gl.T2(k96.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.g(k96.M0(2131752577, null), new fi7((byte) 4));
            alertDialog$Builder.j(k96.M0(2131751586, null), new im6(this, (byte) 17));
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, wjbVar);
            }
        } else if (i == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i3 = ((d) an7Var).currentAccount;
                Uri a = ((ym7) sparseArray.valueAt(0)).a(i3);
                if (a != null) {
                    intent.putExtra("android.intent.extra.STREAM", a);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    i2 = ((d) an7Var).currentAccount;
                    Uri a2 = ((ym7) sparseArray.valueAt(i4)).a(i2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            an7Var.c0();
            an7Var.h0();
            an7Var.e.f();
        }
    }
}
