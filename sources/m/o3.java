package m;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextPaint;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.nd;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.ba;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class o3 {
    public Object f18682a;
    public Object f18683b;
    public Object f18684c;
    public Object d;
    public Object f18685e;
    public Object f18686f;
    public Object f18687g;

    public o3(Set set, a0.f fVar, String str, String str2, p8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f18682a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f18684c = fVar2;
        this.d = str;
        this.f18685e = str2;
        this.f18686f = aVar == null ? p8.a.f53425a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f18683b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.m(it);
    }

    public static void a(FrameLayout frameLayout) {
        m6.d dVar = m6.d.f19186e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, m6.e.f19188a);
        String b10 = p6.s.b(context, d);
        String c2 = p6.s.c(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b10);
        linearLayout.addView(textView);
        Intent b11 = dVar.b(d, context, null);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new androidx.mediarouter.app.z(context, b11));
        }
    }

    public void b(z6.d dVar) {
        if (((android.support.v4.media.session.a0) this.f18683b) != null) {
            dVar.b();
            return;
        }
        if (((LinkedList) this.f18684c) == null) {
            this.f18684c = new LinkedList();
        }
        ((LinkedList) this.f18684c).add(dVar);
        z6.c cVar = (z6.c) this.d;
        this.f18686f = cVar;
        ArrayList arrayList = (ArrayList) this.f18687g;
        Context context = (Context) this.f18682a;
        if (cVar != null && ((android.support.v4.media.session.a0) this.f18683b) == null) {
            try {
                synchronized (j8.a.class) {
                    j8.a.a(context);
                }
                k8.f Y0 = nd.a(context).Y0(new z6.b(context));
                if (Y0 != null) {
                    ((z6.c) this.f18686f).a(new android.support.v4.media.session.a0((ai.c0) this.f18685e, Y0));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((android.support.v4.media.session.a0) this.f18683b).k((ba) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (m6.f unused) {
            }
        }
    }

    public o3(String str, fa.f fVar, aa.g gVar) {
        this.d = new b4.n(this, false);
        this.f18685e = new b4.n(this, true);
        this.f18686f = new e5.u(2, (short) 0);
        this.f18687g = new AtomicMarkableReference(null, false);
        this.f18684c = str;
        this.f18682a = new ba.h(fVar);
        this.f18683b = gVar;
    }

    public o3(Context context, e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f18682a = textPaint;
        Paint paint = new Paint();
        this.f18683b = paint;
        this.f18685e = new Paint();
        this.f18686f = new SparseArray();
        this.f18687g = new HashMap();
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getDrawable(2131232547).mutate();
        this.f18684c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231185).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(k6.w0(k6.zi, e6Var));
    }
}
