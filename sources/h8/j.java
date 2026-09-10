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
import n6.q;
import v7.m8;
public final class j {
    public aa.a f9264a;
    public Bundle f9265b;
    public LinkedList f9266c;
    public final d e;
    public final Context f9267f;
    public l2.h f9268g;
    public final l2.h d = new l2.h(this, 26);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f9267f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.f12354a);
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
        while (!this.f9266c.isEmpty() && ((x6.e) this.f9266c.getLast()).a() >= i10) {
            this.f9266c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.f9264a != null) {
            eVar.b();
            return;
        }
        if (this.f9266c == null) {
            this.f9266c = new LinkedList();
        }
        this.f9266c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f9265b;
            if (bundle2 == null) {
                this.f9265b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f9268g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f9267f;
        if (this.f9264a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g X0 = m8.a(context).X0(new x6.b(context));
                if (X0 != null) {
                    this.f9268g.x(new aa.a(this.e, X0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f9264a.p((f) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (k6.f unused) {
            }
        }
    }
}
