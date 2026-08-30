package cb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.f0;
import b4.e0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j7.s7;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
public abstract class k {
    public static final y5.c[] f2227a = new y5.c[0];
    public static final y5.c f2228b;
    public static final y5.c f2229c;
    public static final h7.l d;

    static {
        y5.c cVar = new y5.c("vision.barcode", 1L);
        y5.c cVar2 = new y5.c("vision.custom.ica", 1L);
        y5.c cVar3 = new y5.c("vision.face", 1L);
        y5.c cVar4 = new y5.c("vision.ica", 1L);
        y5.c cVar5 = new y5.c("vision.ocr", 1L);
        y5.c cVar6 = new y5.c("mlkit.langid", 1L);
        f2228b = cVar6;
        y5.c cVar7 = new y5.c("mlkit.nlclassifier", 1L);
        y5.c cVar8 = new y5.c("tflite_dynamite", 1L);
        y5.c cVar9 = new y5.c("mlkit.barcode.ui", 1L);
        y5.c cVar10 = new y5.c("mlkit.smartreply", 1L);
        f2229c = new y5.c("mlkit.segmentation.subject", 1L);
        e0 e0Var = new e0(8, (byte) 0);
        e0Var.B("barcode", cVar);
        e0Var.B("custom_ica", cVar2);
        e0Var.B("face", cVar3);
        e0Var.B("ica", cVar4);
        e0Var.B("ocr", cVar5);
        e0Var.B("langid", cVar6);
        e0Var.B("nlclassifier", cVar7);
        e0Var.B("tflite_dynamite", cVar8);
        e0Var.B("barcode_ui", cVar9);
        e0Var.B("smart_reply", cVar10);
        h7.e eVar = (h7.e) e0Var.d;
        if (eVar == null) {
            h7.l b10 = h7.l.b(e0Var.f1367b, (Object[]) e0Var.f1368c, e0Var);
            h7.e eVar2 = (h7.e) e0Var.d;
            if (eVar2 == null) {
                d = b10;
                e0 e0Var2 = new e0(8, (byte) 0);
                e0Var2.B("com.google.android.gms.vision.barcode", cVar);
                e0Var2.B("com.google.android.gms.vision.custom.ica", cVar2);
                e0Var2.B("com.google.android.gms.vision.face", cVar3);
                e0Var2.B("com.google.android.gms.vision.ica", cVar4);
                e0Var2.B("com.google.android.gms.vision.ocr", cVar5);
                e0Var2.B("com.google.android.gms.mlkit.langid", cVar6);
                e0Var2.B("com.google.android.gms.mlkit.nlclassifier", cVar7);
                e0Var2.B("com.google.android.gms.tflite_dynamite", cVar8);
                e0Var2.B("com.google.android.gms.mlkit_smartreply", cVar10);
                h7.e eVar3 = (h7.e) e0Var2.d;
                if (eVar3 == null) {
                    h7.l.b(e0Var2.f1367b, (Object[]) e0Var2.f1368c, e0Var2);
                    h7.e eVar4 = (h7.e) e0Var2.d;
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

    public static boolean a(Context context, y5.c[] cVarArr) {
        try {
            return ((f6.a) Tasks.await(new com.google.android.gms.common.api.j(context, g6.g.f6481k, com.google.android.gms.common.api.b.f2721i, com.google.android.gms.common.api.i.f2730c).f(new t(cVarArr, 1)).addOnFailureListener(new ab.a(4)))).f6003a;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void b(Context context) {
        h7.b bVar = h7.d.f7015b;
        Object[] objArr = {"ica"};
        s7.a(1, objArr);
        h7.g gVar = new h7.g(1, objArr);
        y5.e.f47082b.getClass();
        if (y5.e.a(context) >= 221500000) {
            int i10 = gVar.d;
            y5.c[] cVarArr = new y5.c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                y5.c cVar = (y5.c) d.get(gVar.get(i11));
                b6.m.h(cVar);
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

    public static void c(Context context, y5.c[] cVarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t(cVarArr, 0));
        b6.m.a("APIs must not be empty.", !arrayList.isEmpty());
        ?? jVar = new com.google.android.gms.common.api.j(context, g6.g.f6481k, com.google.android.gms.common.api.b.f2721i, com.google.android.gms.common.api.i.f2730c);
        g6.a e6 = g6.a.e(arrayList, true);
        if (e6.f6475a.isEmpty()) {
            e = Tasks.forResult(new f6.c(0, false));
        } else {
            v e10 = w.e();
            e10.d = new y5.c[]{y6.b.f47103c};
            e10.f2884b = true;
            e10.f2883a = 27304;
            e10.f2885c = new f0((g6.g) jVar, e6);
            e = jVar.e(0, e10.e());
        }
        e.addOnFailureListener(new z9.d(3));
    }
}
