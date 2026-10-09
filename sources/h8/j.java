package h8;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.a0;
import java.util.ArrayList;
import java.util.LinkedList;
import m2.t;
import n6.q;
import v7.h8;
public final class j {
    public aa.a f11042a;
    public Bundle f11043b;
    public LinkedList f11044c;
    public final d f11045e;
    public final Context f11046f;
    public t f11047g;
    public final t d = new t(this, 22);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.f11045e = dVar;
        this.f11046f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.f14706a);
        String c10 = q.c(context, d);
        String b10 = q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = dVar2.b(context, null, d);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new a0(context, b11));
        }
    }

    public final void b(int i10) {
        while (!this.f11044c.isEmpty() && ((x6.e) this.f11044c.getLast()).a() >= i10) {
            this.f11044c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.f11042a != null) {
            eVar.b();
            return;
        }
        if (this.f11044c == null) {
            this.f11044c = new LinkedList();
        }
        this.f11044c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f11043b;
            if (bundle2 == null) {
                this.f11043b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f11047g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f11046f;
        if (this.f11042a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g W0 = h8.a(context).W0(new x6.b(context));
                if (W0 != null) {
                    this.f11047g.C(new aa.a(this.f11045e, W0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f11042a.n((f) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e7) {
                throw new RuntimeException(e7);
            } catch (k6.f unused) {
            }
        }
    }
}
