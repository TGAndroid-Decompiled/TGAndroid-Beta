package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class xp7 extends d6 {
    public final Context a;
    public final aq7 b;

    public xp7(aq7 aq7Var, Context context) {
        this.b = aq7Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        jla jlaVar;
        aq7 aq7Var = this.b;
        vnb vnbVar = aq7Var.f;
        SparseArray sparseArray = aq7Var.J;
        if (i == -1) {
            jlaVar = ((e) aq7Var).simpleActionBar;
            if (jlaVar.z()) {
                aq7Var.c0();
                return;
            } else {
                aq7Var.finishFragment();
                return;
            }
        }
        if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, aq7Var.getParentActivity());
            String G = ob6.G(sparseArray.size(), "DeleteTones", new Object[0]);
            id idVar = alertDialog$Builder.a;
            idVar.S = G;
            idVar.U = hl.S2(ob6.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.g(ob6.M0(2131752570, null), new hz6((byte) 22));
            alertDialog$Builder.j(ob6.M0(2131751563, null), new bm6(this, (byte) 22));
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, vnbVar);
            }
        } else if (i == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i3 = ((e) aq7Var).currentAccount;
                Uri a = ((yp7) sparseArray.valueAt(0)).a(i3);
                if (a != null) {
                    intent.putExtra("android.intent.extra.STREAM", a);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    i2 = ((e) aq7Var).currentAccount;
                    Uri a2 = ((yp7) sparseArray.valueAt(i4)).a(i2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            aq7Var.c0();
            aq7Var.h0();
            aq7Var.e.f();
        }
    }
}
