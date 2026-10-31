package jb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import m2.t;
import w7.s7;
public abstract class j {
    public static final k6.c[] f9790a = new k6.c[0];
    public static final k6.c f9791b;
    public static final k6.c f9792c;
    public static final t7.l d;

    static {
        k6.c cVar = new k6.c("vision.barcode", 1L);
        k6.c cVar2 = new k6.c("vision.custom.ica", 1L);
        k6.c cVar3 = new k6.c("vision.face", 1L);
        k6.c cVar4 = new k6.c("vision.ica", 1L);
        k6.c cVar5 = new k6.c("vision.ocr", 1L);
        k6.c cVar6 = new k6.c("mlkit.langid", 1L);
        f9791b = cVar6;
        k6.c cVar7 = new k6.c("mlkit.nlclassifier", 1L);
        k6.c cVar8 = new k6.c("tflite_dynamite", 1L);
        k6.c cVar9 = new k6.c("mlkit.barcode.ui", 1L);
        k6.c cVar10 = new k6.c("mlkit.smartreply", 1L);
        f9792c = new k6.c("mlkit.segmentation.subject", 1L);
        a5.a aVar = new a5.a(20, (byte) 0);
        aVar.C("barcode", cVar);
        aVar.C("custom_ica", cVar2);
        aVar.C("face", cVar3);
        aVar.C("ica", cVar4);
        aVar.C("ocr", cVar5);
        aVar.C("langid", cVar6);
        aVar.C("nlclassifier", cVar7);
        aVar.C("tflite_dynamite", cVar8);
        aVar.C("barcode_ui", cVar9);
        aVar.C("smart_reply", cVar10);
        t7.e eVar = (t7.e) aVar.d;
        if (eVar == null) {
            t7.l b10 = t7.l.b(aVar.f281b, (Object[]) aVar.f282c, aVar);
            t7.e eVar2 = (t7.e) aVar.d;
            if (eVar2 == null) {
                d = b10;
                a5.a aVar2 = new a5.a(20, (byte) 0);
                aVar2.C("com.google.android.gms.vision.barcode", cVar);
                aVar2.C("com.google.android.gms.vision.custom.ica", cVar2);
                aVar2.C("com.google.android.gms.vision.face", cVar3);
                aVar2.C("com.google.android.gms.vision.ica", cVar4);
                aVar2.C("com.google.android.gms.vision.ocr", cVar5);
                aVar2.C("com.google.android.gms.mlkit.langid", cVar6);
                aVar2.C("com.google.android.gms.mlkit.nlclassifier", cVar7);
                aVar2.C("com.google.android.gms.tflite_dynamite", cVar8);
                aVar2.C("com.google.android.gms.mlkit_smartreply", cVar10);
                t7.e eVar3 = (t7.e) aVar2.d;
                if (eVar3 == null) {
                    t7.l.b(aVar2.f281b, (Object[]) aVar2.f282c, aVar2);
                    t7.e eVar4 = (t7.e) aVar2.d;
                    if (eVar4 == null) {
                        return;
                    }
                    throw eVar4.a();
                }
                throw eVar3.a();
            }
            throw eVar2.a();
        }
        throw eVar.a();
    }

    public static boolean a(Context context, k6.c[] cVarArr) {
        try {
            return ((r6.a) Tasks.await(new com.google.android.gms.common.api.j(context, s6.g.f48087k, com.google.android.gms.common.api.b.f4337k, com.google.android.gms.common.api.i.f4346c).f(new r(cVarArr, 1)).addOnFailureListener(new kb.a(9)))).f46331a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void b(Context context) {
        t7.b bVar = t7.d.f48539b;
        Object[] objArr = {"ica"};
        s7.a(1, objArr);
        t7.g gVar = new t7.g(1, objArr);
        k6.e.f10936b.getClass();
        if (k6.e.a(context) >= 221500000) {
            int i10 = gVar.d;
            k6.c[] cVarArr = new k6.c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                k6.c cVar = (k6.c) d.get(gVar.get(i11));
                n6.l.g(cVar);
                cVarArr[i11] = cVar;
            }
            c(context, cVarArr);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, k6.c[] cVarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(cVarArr, 0));
        n6.l.a("APIs must not be empty.", !arrayList.isEmpty());
        ?? jVar = new com.google.android.gms.common.api.j(context, s6.g.f48087k, com.google.android.gms.common.api.b.f4337k, com.google.android.gms.common.api.i.f4346c);
        s6.a b10 = s6.a.b(arrayList, true);
        if (b10.f48081a.isEmpty()) {
            e = Tasks.forResult(new r6.c(0, false));
        } else {
            v b11 = w.b();
            b11.d = new k6.c[]{k7.b.f10955c};
            b11.f4495b = true;
            b11.f4494a = 27304;
            b11.f4496c = new t((s6.g) jVar, b10);
            e = jVar.e(0, b11.a());
        }
        e.addOnFailureListener(new b(9));
    }
}
