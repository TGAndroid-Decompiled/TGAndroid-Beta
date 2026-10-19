package h8;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.z;
import java.util.ArrayList;
import java.util.LinkedList;
import n6.q;
import v7.a8;
public final class j {
    public androidx.biometric.e f11694a;
    public Bundle f11695b;
    public LinkedList f11696c;
    public final d e;
    public final Context f11697f;
    public te.b f11698g;
    public final te.b d = new te.b(this, 5);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f11697f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.f14974a);
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
            button.setOnClickListener(new z(context, b11));
        }
    }

    public final void b(int i10) {
        while (!this.f11696c.isEmpty() && ((x6.e) this.f11696c.getLast()).a() >= i10) {
            this.f11696c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.f11694a != null) {
            eVar.b();
            return;
        }
        if (this.f11696c == null) {
            this.f11696c = new LinkedList();
        }
        this.f11696c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f11695b;
            if (bundle2 == null) {
                this.f11695b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f11698g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f11697f;
        if (this.f11694a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g W0 = a8.a(context).W0(new x6.b(context));
                if (W0 != null) {
                    this.f11698g.d(new androidx.biometric.e(this.e, W0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f11694a.n((f) obj);
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
