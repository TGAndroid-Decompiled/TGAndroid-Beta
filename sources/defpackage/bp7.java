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
public final class bp7 extends c6 {
    public final Context a;
    public final ep7 b;

    public bp7(ep7 ep7Var, Context context) {
        this.b = ep7Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        rja rjaVar;
        ep7 ep7Var = this.b;
        ylb ylbVar = ep7Var.f;
        SparseArray sparseArray = ep7Var.J;
        if (i == -1) {
            rjaVar = ((d) ep7Var).simpleActionBar;
            if (rjaVar.x()) {
                ep7Var.d0();
                return;
            } else {
                ep7Var.finishFragment();
                return;
            }
        }
        if (i == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, ep7Var.getParentActivity());
            String G = jb6.G(sparseArray.size(), "DeleteTones", new Object[0]);
            he heVar = alertDialog$Builder.a;
            heVar.S = G;
            heVar.U = gm.S2(jb6.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.g(jb6.M0(2131752542, null), new bh7((byte) 6));
            alertDialog$Builder.j(jb6.M0(2131751535, null), new cj6(this, (byte) 20));
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, ylbVar);
            }
        } else if (i == 2) {
            int size = sparseArray.size();
            Context context = this.a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i3 = ((d) ep7Var).currentAccount;
                Uri a = ((cp7) sparseArray.valueAt(0)).a(i3);
                if (a != null) {
                    intent.putExtra("android.intent.extra.STREAM", a);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    i2 = ((d) ep7Var).currentAccount;
                    Uri a2 = ((cp7) sparseArray.valueAt(i4)).a(i2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            ep7Var.d0();
            ep7Var.i0();
            ep7Var.e.f();
        }
    }
}
