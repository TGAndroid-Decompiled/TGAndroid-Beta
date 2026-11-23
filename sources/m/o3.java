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
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.ga;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class o3 {
    public Object f20189a;
    public Object f20190b;
    public Object f20191c;
    public Object d;
    public Object f20192e;
    public Object f20193f;
    public Object f20194g;

    public o3(Set set, a0.f fVar, String str, String str2, q8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f20189a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f20191c = fVar2;
        this.d = str;
        this.f20192e = str2;
        this.f20193f = aVar == null ? q8.a.f56113a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f20190b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static void a(FrameLayout frameLayout) {
        n6.d dVar = n6.d.f21459e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, n6.e.f21461a);
        String b10 = q6.s.b(context, d);
        String c10 = q6.s.c(context, d);
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
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new a7.d(context, b11));
        }
    }

    public void b(a7.c cVar) {
        if (((h6.m) this.f20190b) != null) {
            cVar.b();
            return;
        }
        if (((LinkedList) this.f20191c) == null) {
            this.f20191c = new LinkedList();
        }
        ((LinkedList) this.f20191c).add(cVar);
        cb.c cVar2 = (cb.c) this.d;
        this.f20193f = cVar2;
        ArrayList arrayList = (ArrayList) this.f20194g;
        Context context = (Context) this.f20189a;
        if (cVar2 != null && ((h6.m) this.f20190b) == null) {
            try {
                synchronized (k8.b.class) {
                    k8.b.a(context);
                }
                l8.f y12 = c8.j1.a(context).y1(new a7.b(context));
                if (y12 != null) {
                    ((cb.c) this.f20193f).p(new h6.m((ai.l0) this.f20192e, y12));
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((h6.m) this.f20190b).y((ga) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (n6.f unused) {
            }
        }
    }

    public o3(String str, ga.d dVar, ba.e eVar) {
        this.d = new ab.q(this, false);
        this.f20192e = new ab.q(this, true);
        ?? obj = new Object();
        obj.f5173a = new ArrayList();
        obj.f5174b = 128;
        this.f20193f = obj;
        this.f20194g = new AtomicMarkableReference(null, false);
        this.f20191c = str;
        this.f20189a = new ca.h(dVar);
        this.f20190b = eVar;
    }

    public o3(Context context, h6 h6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f20189a = textPaint;
        Paint paint = new Paint();
        this.f20190b = paint;
        this.f20192e = new Paint();
        this.f20193f = new SparseArray();
        this.f20194g = new HashMap();
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getDrawable(2131232551).mutate();
        this.f20191c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231185).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(m6.w0(m6.Ci, h6Var));
    }
}
