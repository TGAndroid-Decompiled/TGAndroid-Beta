package a9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f6.d0;
import f6.e0;
import j6.v;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import m6.m;
import m6.n;
import sg.i0;
import z7.ma;
public final class h implements Runnable {
    public final int f762a;
    public Object f763b;
    public Object f764c;
    public Object d;

    public h() {
        this.f762a = 8;
    }

    private final void a() {
        f6.f fVar;
        d0 d0Var = (d0) this.f763b;
        HashMap hashMap = d0Var.f11246b.D;
        String str = (String) this.f764c;
        synchronized (hashMap) {
            fVar = (f6.f) d0Var.f11246b.D.get(str);
        }
        if (fVar != null) {
            ((h6.h) fVar).o((String) this.d);
        } else {
            e0.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        f6.f fVar;
        synchronized (((v) this.f763b).I) {
            fVar = (f6.f) ((v) this.f763b).I.get((String) this.f764c);
        }
        if (fVar != null) {
            ((h6.h) fVar).o((String) this.d);
        } else {
            v.Y.b("Discarded message for unknown namespace '%s'", (String) this.f764c);
        }
    }

    private final void c() {
        int i7;
        Task k10;
        m6.a aVar = (m6.a) this.f764c;
        Intent intent = aVar.f19882a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        boolean isEmpty = TextUtils.isEmpty(stringExtra);
        Integer num = null;
        if (isEmpty) {
            k10 = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.f19882a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.f19882a;
            if (intent3.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            n i10 = n.i((Context) this.f763b);
            synchronized (i10) {
                i7 = i10.f19920a;
                i10.f19920a = i7 + 1;
            }
            k10 = i10.k(new m(i7, 2, bundle, 0));
        }
        k10.addOnCompleteListener(m6.d.f19897c, new g6.d0((CountDownLatch) this.d, 18));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: a9.h.run():void");
    }

    public h(Object obj, Object obj2, Object obj3, int i7) {
        this.f762a = i7;
        this.f763b = obj;
        this.f764c = obj2;
        this.d = obj3;
    }

    public h(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f762a = i7;
        this.f763b = obj2;
        this.f764c = obj3;
        this.d = obj;
    }

    public h(ma maVar, i0 i0Var, String str) {
        this.f762a = 12;
        this.f763b = maVar;
        this.f764c = i0Var;
        this.d = str;
    }
}
