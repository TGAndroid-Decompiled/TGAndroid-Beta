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
import m.y0;
import n6.r;
import v7.h8;
public final class j {
    public aa.a f11040a;
    public Bundle f11041b;
    public LinkedList f11042c;
    public final d f11043e;
    public final Context f11044f;
    public y0 f11045g;
    public final y0 d = new y0(this, 25);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.f11043e = dVar;
        this.f11044f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.f14702a);
        String c10 = r.c(context, d);
        String b10 = r.b(context, d);
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
        while (!this.f11042c.isEmpty() && ((x6.e) this.f11042c.getLast()).a() >= i10) {
            this.f11042c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.f11040a != null) {
            eVar.b();
            return;
        }
        if (this.f11042c == null) {
            this.f11042c = new LinkedList();
        }
        this.f11042c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f11041b;
            if (bundle2 == null) {
                this.f11041b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f11045g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f11044f;
        if (this.f11040a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g W0 = h8.a(context).W0(new x6.b(context));
                if (W0 != null) {
                    this.f11045g.r(new aa.a(this.f11043e, W0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f11040a.o((f) obj);
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
