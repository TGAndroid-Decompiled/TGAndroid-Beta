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
import v7.k8;
public final class j {
    public aa.a f10151a;
    public Bundle f10152b;
    public LinkedList f10153c;
    public final d e;
    public final Context f10154f;
    public n2.e f10155g;
    public final n2.e d = new n2.e(this, 25);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f10154f = context;
    }

    public static void a(d dVar) {
        k6.d dVar2 = k6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, k6.e.f13510a);
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
        while (!this.f10153c.isEmpty() && ((x6.e) this.f10153c.getLast()).a() >= i10) {
            this.f10153c.removeLast();
        }
    }

    public final void c(Bundle bundle, x6.e eVar) {
        if (this.f10151a != null) {
            eVar.b();
            return;
        }
        if (this.f10153c == null) {
            this.f10153c = new LinkedList();
        }
        this.f10153c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f10152b;
            if (bundle2 == null) {
                this.f10152b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f10155g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f10154f;
        if (this.f10151a == null) {
            try {
                synchronized (e.class) {
                    e.b(context);
                }
                i8.g X0 = k8.a(context).X0(new x6.b(context));
                if (X0 != null) {
                    this.f10155g.E(new aa.a(this.e, X0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f10151a.o((f) obj);
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
