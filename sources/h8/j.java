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
import ji.u4;
import n6.q;
import v7.j8;
public final class j {
    public aa.a f10908a;
    public Bundle f10909b;
    public LinkedList f10910c;
    public final d f10911e;
    public final Context f10912f;
    public u4 f10913g;
    public final u4 d = new u4(this, 28);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.f10911e = dVar;
        this.f10912f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.f14815a);
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
        while (!this.f10910c.isEmpty() && ((x6.e) this.f10910c.getLast()).a() >= i10) {
            this.f10910c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.f10908a != null) {
            eVar.b();
            return;
        }
        if (this.f10910c == null) {
            this.f10910c = new LinkedList();
        }
        this.f10910c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f10909b;
            if (bundle2 == null) {
                this.f10909b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f10913g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f10912f;
        if (this.f10908a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g X0 = j8.a(context).X0(new x6.b(context));
                if (X0 != null) {
                    this.f10913g.C(new aa.a(this.f10911e, X0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f10908a.u((f) obj);
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
