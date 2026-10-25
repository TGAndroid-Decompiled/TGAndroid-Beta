package i8;

import a8.dd;
import a8.h0;
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
import li.e3;
import o6.q;
public final class j {
    public h0 f13893a;
    public Bundle f13894b;
    public LinkedList f13895c;
    public final d e;
    public final Context f13896f;
    public e3 f13897g;
    public final e3 d = new e3(this, 25);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f13896f = context;
    }

    public static void a(d dVar) {
        l6.d dVar2 = l6.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, l6.e.f16931a);
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
        while (!this.f13895c.isEmpty() && ((y6.e) this.f13895c.getLast()).a() >= i10) {
            this.f13895c.removeLast();
        }
    }

    public final void c(Bundle bundle, y6.e eVar) {
        if (this.f13893a != null) {
            eVar.b();
            return;
        }
        if (this.f13895c == null) {
            this.f13895c = new LinkedList();
        }
        this.f13895c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.f13894b;
            if (bundle2 == null) {
                this.f13894b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.f13897g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f13896f;
        if (this.f13893a == null) {
            try {
                synchronized (e.class) {
                    e.c(context);
                }
                j8.g W0 = dd.a(context).W0(new y6.b(context));
                if (W0 != null) {
                    this.f13897g.x0(new h0(this.e, W0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        this.f13893a.p((f) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (l6.f unused) {
            }
        }
    }
}
