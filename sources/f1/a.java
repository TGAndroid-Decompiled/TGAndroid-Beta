package f1;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import c1.d;
import c5.g;
import c5.n;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import mg.c0;
import org.telegram.messenger.i0;
import org.telegram.messenger.r20;
import org.telegram.messenger.ri;
import org.telegram.messenger.si;
import org.telegram.messenger.t1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.g31;
import org.telegram.ui.lw0;
import org.telegram.ui.re0;
import org.telegram.ui.v50;
import r2.y;
import rh.e6;
import sg.o0;
import th.c3;
import th.i7;
import v0.h;
import v0.m;
import v0.o;
public final class a implements OnFailureListener, u1, yb0, n, si, t1, i7 {
    public final Object f6722a;
    public final Object f6723b;
    public final Object f6724c;
    public final Object d;
    public final Object e;

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f6722a = obj;
        this.f6723b = obj2;
        this.f6724c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override
    public void a(g gVar, List list) {
        i0.g3(new c0((e6) this.f6722a, list, (q70) this.f6723b, (TLRPC.TL_inputStorePaymentStarsGift) this.f6724c, (TL_stars.TL_starsGiftOption) this.d, gVar, (Activity) this.e, 15));
    }

    @Override
    public void b(g gVar, List list) {
        i0.g3(new c0((re0) this.f6722a, gVar, list, (String) this.f6723b, (TLRPC.TL_inputStorePaymentAuthCode) this.f6724c, (TLRPC.TL_payments_canPurchaseStore) this.d, (v50) this.e, 6));
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        TLRPC.TL_availableReaction tL_availableReaction;
        g31 g31Var = (g31) this.f6722a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f6723b;
        HashMap hashMap = (HashMap) this.f6724c;
        ArrayList arrayList2 = (ArrayList) this.d;
        Runnable runnable = (Runnable) this.e;
        g31Var.getClass();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (((ri) arrayList.get(i10)).f17936a.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((ri) arrayList.get(i10)).f17936a.substring(9))));
                } else {
                    int i11 = g31Var.W;
                    if ((i11 == 1 || i11 == 11 || i11 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(((ri) arrayList.get(i10)).f17936a)) != null) {
                        arrayList2.add(o0.c(tL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void h(x1 x1Var, int i10) {
        i3 i3Var = (i3) this.f6722a;
        ((boolean[]) this.f6723b)[0] = true;
        i3Var.h(i3Var.f20401x, (h3) this.f6724c, true);
        ((r20) this.d).a(Boolean.TRUE);
        ((x1[]) this.e)[0].dismiss();
    }

    @Override
    public void j(float f7, Canvas canvas, RectF rectF, boolean z10) {
        y yVar = (y) this.f6722a;
        RectF rectF2 = (RectF) this.f6723b;
        c3 c3Var = (c3) this.f6724c;
        RectF rectF3 = (RectF) this.d;
        c3 c3Var2 = (c3) this.e;
        RectF rectF4 = c3Var.f48853m;
        rectF2.set(rectF4);
        RectF rectF5 = c3Var2.f48853m;
        rectF3.set(rectF5);
        rectF4.set(rectF);
        try {
            float width = rectF.width() / rectF2.width();
            float centerX = rectF.centerX() - ((((1.0f - f7) * 2.0f) + width) * (rectF2.centerX() - rectF3.centerX()));
            float centerY = rectF.centerY();
            float width2 = (rectF3.width() / 2.0f) * width;
            float height = (rectF3.height() / 2.0f) * width;
            rectF5.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
        } catch (Exception unused) {
        }
        int i10 = ProfileStoriesView.f34063s0;
        ((lw0) yVar.f46301b).a(canvas, c3Var, c3Var2);
        rectF4.set(rectF2);
        rectF5.set(rectF3);
    }

    @Override
    public void onFailure(Exception e) {
        m request = (m) this.f6722a;
        b bVar = (b) this.f6723b;
        h hVar = (h) this.f6724c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        i.e(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        i.e(request, "request");
        for (o oVar : request.f50291a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new d(bVar.e).g(request, cancellationSignal, executor, hVar);
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        s4.c((vh.d) this.f6722a, (ac0) this.f6723b, (ac0) this.f6724c, (ac0) this.d, (ac0) this.e);
    }
}
