package aa;

import ai.m;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import ci.l2;
import ci.l6;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ei.b4;
import ei.h9;
import ei.j4;
import ei.m9;
import gi.r8;
import gi.t8;
import gi.x1;
import gi.y1;
import ii.d4;
import ii.v2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import l9.q;
import l9.r;
import l9.y;
import lg.y0;
import m2.s;
import mi.c2;
import mi.c4;
import mi.g2;
import mi.m1;
import mi.p;
import mi.q3;
import mi.t3;
import o4.b1;
import o4.e0;
import o4.e1;
import o4.n0;
import o4.n1;
import o4.o0;
import o4.r1;
import o4.v;
import o4.v0;
import o4.w;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.ii;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.or;
import org.telegram.messenger.pr;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l0;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.cl0;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
public final class a implements Continuation, androidx.car.app.utils.b, nw, or, m9, ii, p1, cl0, tk, n0, q, l0, ab0, r4 {
    public final int f277a;
    public final Object f278b;
    public final Object f279c;
    public final Object d;

    public a(Object obj, Object obj2, Object obj3, int i3) {
        this.f277a = i3;
        this.f278b = obj;
        this.f279c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean G() {
        switch (this.f277a) {
            case 3:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f277a) {
            case 27:
                uk ukVar = (uk) this.f278b;
                ukVar.f38794o0.d((TLRPC.TL_messageMediaGeo) this.f279c, ukVar.f38795p0, z10, i3, ((Long) this.d).longValue());
                ukVar.f38416b.a(true);
                return;
            default:
                an anVar = (an) this.f278b;
                anVar.f31924k0.c((TLRPC.TL_messageMediaToDo) this.f279c, null, null, null, z10, i3, ((Long) this.d).longValue());
                anVar.f38416b.a(true);
                return;
        }
    }

    @Override
    public boolean N(uw uwVar) {
        switch (this.f277a) {
            case 3:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(String str) {
        b4 b4Var = (b4) this.f278b;
        j4 j4Var = b4Var.f10126x;
        j4Var.getStoriesController().r(j4Var.f10477l1, str, new m(b4Var, (TL_stories.StoryItem) this.f279c, (e6) this.d, 5));
    }

    @Override
    public y apply(Object obj) {
        int i3 = this.f277a;
        Object obj2 = this.d;
        Object obj3 = this.f279c;
        Object obj4 = this.f278b;
        switch (i3) {
            case 15:
                e0 e0Var = (e0) obj4;
                Handler handler = e0Var.f20628l;
                s sVar = new s(e0Var, (v) obj3, new lg.y(e0Var, (v0) obj2, (w) obj, 14));
                r1 r1Var = new r1(0);
                String str = g2.n0.f11873a;
                ?? obj5 = new Object();
                g2.n0.W(handler, new h9((Object) obj5, sVar, r1Var, 3));
                return obj5;
            default:
                e0 e0Var2 = (e0) obj4;
                v vVar = (v) obj3;
                List list = (List) obj;
                Handler handler2 = e0Var2.f20628l;
                s sVar2 = new s(e0Var2, vVar, new b1(e0Var2, (e1) obj2, vVar, list, 0));
                r1 r1Var2 = new r1(0);
                String str2 = g2.n0.f11873a;
                ?? obj6 = new Object();
                g2.n0.W(handler2, new h9((Object) obj6, sVar2, r1Var2, 3));
                return obj6;
        }
    }

    @Override
    public void c(v vVar) {
        Bundle bundle = (Bundle) this.f279c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        e0 e0Var = ((o0) this.f278b).h;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        l9.w n4 = e0Var.n(vVar);
        if (resultReceiver != null) {
            n4.b(new s(15, n4, resultReceiver), r.f18162a);
        }
    }

    @Override
    public void call() {
        w.b bVar;
        switch (this.f277a) {
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f278b;
                String str = (String) this.d;
                Object obj = this.f279c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e10) {
                        androidx.car.app.utils.g.f(iOnDoneCallback, str, e10);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                return;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f278b;
                Exception exc = (Exception) this.f279c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                    return;
                } catch (w.f e11) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e11);
                    return;
                }
        }
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        switch (this.f277a) {
            case 11:
                p pVar = (p) this.f278b;
                mi.a aVar = (mi.a) this.f279c;
                bi biVar = (bi) this.d;
                t3 t3Var = pVar.f19793r;
                if (messageMedia != null && messageMedia.geo != null) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f19431b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f27226w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f27226w = 600;
                        pageblockmap.h = 400;
                    }
                    g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    pVar.a0(true);
                    biVar.a(true);
                    t3Var.post(new mi.g(pVar, aVar, 0));
                    return;
                }
                return;
            default:
                c2 c2Var = (c2) this.f278b;
                mi.a aVar2 = (mi.a) this.f279c;
                bi biVar2 = (bi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    g2 g2Var3 = c2Var.Q.R3;
                    if (g2Var3 != null) {
                        g2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f19431b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f27226w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f27226w = 600;
                        pageblockmap2.h = 400;
                    }
                    g2 g2Var4 = c2Var.Q.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    biVar2.a(true);
                    c2Var.Q.post(new m1(c2Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void e(int i3) {
        switch (this.f277a) {
            case 9:
                v2 v2Var = (v2) this.f278b;
                hb0 hb0Var = (hb0) this.f279c;
                String str = (String) this.d;
                if (i3 != 3) {
                    hb0Var.dismiss();
                }
                v2Var.d.E.F(str, f1.D(i3).toLowerCase(Locale.ROOT), false);
                return;
            default:
                hb0 hb0Var2 = (hb0) this.f278b;
                d4 d4Var = (d4) this.f279c;
                String str2 = (String) this.d;
                if (i3 != 3) {
                    hb0Var2.dismiss();
                }
                d4Var.getWebViewContainer().F(str2, f1.D(i3).toLowerCase(Locale.ROOT), false);
                return;
        }
    }

    @Override
    public void f(Canvas canvas, RectF rectF, float f10) {
        n7 n7Var = (n7) this.f278b;
        yi0 yi0Var = (yi0) this.f279c;
        int[] iArr = (int[]) this.d;
        n7Var.c(canvas, rectF, f10);
        n7Var.f(canvas, rectF, f10);
        if (n7Var.h) {
            n7Var.b(canvas, rectF, f10);
        } else {
            n7Var.e(canvas, rectF, f10);
        }
        if (yi0Var != null && yi0Var.f40731b0 && yi0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            yi0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void g(s1 s1Var, int i3) {
        switch (this.f277a) {
            case 7:
                ((t8) this.f278b).N0((r8) this.f279c, (Runnable) this.d, true);
                return;
            case 8:
                Activity activity = (Activity) this.f278b;
                boolean[] zArr = (boolean[]) this.f279c;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + t0.f25457b.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                pVar.a(bool, bool);
                return;
            case 10:
                kg.e1 e1Var = (kg.e1) this.f278b;
                TLRPC.User user = (TLRPC.User) this.d;
                e1Var.getClass();
                ((boolean[]) this.f279c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = hp.s1(e1Var.f16997f).f22989d7.edit();
                    edit.putBoolean("inlinegeo_" + user.f27150id, true).commit();
                    e1Var.G();
                    return;
                }
                return;
            case 13:
                c4 c4Var = (c4) this.d;
                String trim = ((EditTextBoldCursor) this.f278b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f279c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i10 = c4Var.f19544a;
                    q3 q3Var = c4Var.f19545b;
                    switch (i10) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            q3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            q3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 17:
                ((boolean[]) this.f278b)[0] = true;
                ((u10) this.f279c).a(Boolean.FALSE);
                ((s1[]) this.d)[0].dismiss();
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f278b;
                zi ziVar = (zi) this.f279c;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.d;
                Activity activity2 = chatActivityEnterView.P2;
                if (activity2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    activity2.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                    chatActivityEnterView.f31143j3 = ziVar;
                    chatActivityEnterView.f31148k3 = keyboardButtonProto;
                    return;
                }
                yy.C(chatActivityEnterView.R).o0(ziVar, keyboardButtonProto);
                return;
            case 24:
                bi biVar = (bi) this.f278b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f279c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                int i11 = biVar.E3;
                if (tL_attachMenuBot != null) {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = hp.s1(i11).q1(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new h6(14, biVar, tL_attachMenuBot), 66);
                    return;
                }
                li.b0(i11).L1(user2.f27150id);
                return;
            case 26:
                hk hkVar = (hk) this.f278b;
                y0 y0Var = (y0) this.f279c;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.d;
                TextView textView = hkVar.V;
                String str = null;
                if (y0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i12 = -hkVar.f34429w0;
                    hkVar.f34429w0 = i12;
                    g0.G3(i12, y0Var, null);
                    return;
                }
                String trim3 = y0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim3)) {
                    str = trim3;
                }
                hkVar.f34425t0 = str;
                hkVar.f34426u0 = !c2Var.b();
                if (TextUtils.isEmpty(hkVar.f34425t0)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(hkVar.f34425t0);
                    textView.setVisibility(0);
                }
                hkVar.k0();
                s1Var.dismiss();
                hkVar.a0();
                return;
            default:
                an anVar = (an) this.f278b;
                View view = (View) this.f279c;
                anVar.getClass();
                view.setTag(null);
                anVar.c0(view, (z5) this.d, false);
                return;
        }
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        int i3;
        int i10;
        ArrayList<TLRPC.Document> arrayList2;
        int i11;
        ArrayList arrayList3;
        boolean z10;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        x1 x1Var = (x1) this.f278b;
        li liVar = (li) this.d;
        ArrayList arrayList6 = x1Var.h;
        SparseIntArray sparseIntArray = x1Var.E;
        ArrayList arrayList7 = x1Var.f13818n;
        y1 y1Var = x1Var.O;
        ArrayList arrayList8 = x1Var.f13821w;
        HashSet hashSet = x1Var.M;
        ArrayList arrayList9 = x1Var.f13820s;
        if (!TextUtils.equals((String) this.f279c, x1Var.I)) {
            return;
        }
        ArrayList j10 = i6.j(x1Var.I, null);
        int i12 = 0;
        for (int i13 = 0; i13 < j10.size(); i13++) {
            try {
                ?? obj = new Object();
                obj.f22931a = ((g6) j10.get(i13)).f22669c.toString();
                arrayList5.add(obj);
            } catch (Exception unused) {
            }
        }
        x1Var.f13823y = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        int i14 = 1;
        x1Var.f13823y++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (y1Var.f13653a == 0) {
            hashSet.clear();
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                hi hiVar = (hi) arrayList5.get(i15);
                String str2 = hiVar.f22931a;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) x1Var.d.get(hiVar.f22931a)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i16 = 0; i16 < hashSet.size(); i16++) {
                arrayList9.add(null);
            }
            x1Var.f13823y = hashSet.size() + x1Var.f13823y;
            i3 = 1;
            i10 = 0;
        } else {
            HashMap hashMap = liVar.f24020e0;
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                hi hiVar2 = (hi) arrayList5.get(i17);
                int i18 = i12;
                String str3 = hiVar2.f22931a;
                if (str3 == null || str3.startsWith("animated_") || (arrayList3 = (ArrayList) hashMap.get(hiVar2.f22931a)) == null || arrayList3.isEmpty()) {
                    i11 = i14;
                } else {
                    i11 = i14;
                    for (int i19 = i18; i19 < arrayList3.size(); i19++) {
                        TLRPC.Document document = (TLRPC.Document) arrayList3.get(i19);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            x1Var.f13823y++;
                        }
                    }
                }
                i17++;
                i12 = i18;
                i14 = i11;
            }
            i3 = i14;
            i10 = i12;
            ArrayList arrayList10 = liVar.f24051t0[i10];
            int i20 = i10;
            while (i20 < arrayList5.size()) {
                hi hiVar3 = (hi) arrayList5.get(i20);
                String str4 = hiVar3.f22931a;
                if (str4 != null && !str4.startsWith("animated_")) {
                    for (int i21 = i10; i21 < arrayList10.size(); i21++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i21);
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                        } else if (!stickerSetCovered.covers.isEmpty()) {
                            arrayList2 = stickerSetCovered.covers;
                        } else if (stickerSetCovered.cover != null) {
                            ArrayList<TLRPC.Document> arrayList11 = new ArrayList<>();
                            arrayList11.add(stickerSetCovered.cover);
                            arrayList2 = arrayList11;
                        }
                        for (int i22 = i10; i22 < arrayList2.size(); i22++) {
                            String V = zi.V(arrayList2.get(i22), null, null);
                            if (V != null && V.contains(hiVar3.f22931a)) {
                                arrayList9.add(arrayList2.get(i22));
                                x1Var.f13823y++;
                            }
                        }
                    }
                }
                i20++;
                arrayList5 = arrayList;
            }
        }
        String O3 = g0.O3((x1Var.I + "").toLowerCase());
        for (int i23 = i10; i23 < arrayList6.size(); i23++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i23);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String O32 = g0.O3((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(x1Var.f13823y, size);
                    arrayList9.add(null);
                    x1Var.f13823y++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    x1Var.f13823y = tL_messages_stickerSet.documents.size() + x1Var.f13823y;
                }
            }
        }
        int i24 = i3;
        if (arrayList8.size() <= i24 && arrayList9.size() <= i24) {
            z10 = i24;
        } else {
            z10 = i10;
        }
        x1Var.f13822x = z10;
        if (z10 != 0) {
            x1Var.f13823y += i24;
        }
        if (z10 == 0) {
            x1Var.L += i24;
        }
        x1Var.J = x1Var.I;
        x1Var.f();
        boolean z11 = i10;
        gi.m1.z1(y1Var.f13914b, z11 ? 1 : 0, z11 ? 1 : 0);
        y1Var.f13917f.c(z11);
        y1Var.f13916e.n(z11);
    }

    @Override
    public void i(int i3) {
        r4 r4Var = (r4) this.f278b;
        boolean[] zArr = (boolean[]) this.f279c;
        hi.d dVar = (hi.d) this.d;
        if (i3 == 1) {
            r4Var.L(2147483646, 0, zArr[0]);
            ((t2) dVar.f14429b).f28625y0.run();
        }
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        switch (this.f277a) {
            case 19:
                t4.g(null, null, 0L, 0L, 0, (cb0) this.f278b, (a4) this.f279c, (org.telegram.ui.Components.b4) this.d);
                return;
            default:
                t4.g(null, null, 0L, 0L, 0, (cb0) this.f278b, (s3) this.f279c, (org.telegram.ui.Components.t3) this.d);
                return;
        }
    }

    @Override
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f278b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f279c;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        long j10;
        TLRPC.User a22;
        switch (this.f277a) {
            case 3:
                l6 l6Var = (l6) this.f278b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f279c;
                uw uwVar2 = (uw) this.d;
                if (arrayList.isEmpty()) {
                    return false;
                }
                long j11 = ((pr) arrayList.get(0)).f24797a;
                Long l10 = (Long) org.telegram.messenger.d4.f(l6Var.f28583a).f22146r.get(tL_starGiftUnique.slug);
                if (l10 != null) {
                    j10 = l10.longValue();
                } else {
                    j10 = 0;
                }
                if (j10 != 0 && j10 != j11) {
                    t4.m0(l6Var.getContext(), l6Var.J0, l6Var.f28583a, tL_starGiftUnique, j10, new l2(l6Var, j11, tL_starGiftUnique, uwVar2, 1));
                } else {
                    org.telegram.messenger.d4.f(l6Var.f28583a).s(j11, new jg.b(null, tL_starGiftUnique.slug), null, true);
                    uwVar2.presentFragment(wm.ra(j11), true);
                }
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f278b;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                wm wmVar = chatActivityEnterView.Q2;
                TLRPC.Message message = ((zi) this.f279c).f26868k;
                long j12 = message.from_id.user_id;
                long j13 = message.via_bot_id;
                if (j13 != 0) {
                    j12 = j13;
                }
                if (hp.s1(chatActivityEnterView.S.f21919a).a2(Long.valueOf(j12)) == null) {
                    uwVar.finishFragment();
                } else {
                    long j14 = ((pr) arrayList.get(0)).f24797a;
                    li.b0(chatActivityEnterView.R).Q1(j14, 0, "@" + l10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, null, null, 0L, true, false, null);
                    if (j14 != chatActivityEnterView.R2) {
                        if (!m5.C(j14)) {
                            Bundle bundle = new Bundle();
                            if (m5.E(j14)) {
                                bundle.putLong("user_id", j14);
                            } else {
                                bundle.putLong("chat_id", -j14);
                            }
                            if (hp.s1(chatActivityEnterView.S.f21919a).E(bundle, uwVar, null, null)) {
                                if (wmVar.presentFragment(new wm(bundle), true)) {
                                    if (!g0.Q1()) {
                                        wmVar.removeSelfFromStack();
                                    }
                                } else {
                                    uwVar.finishFragment();
                                }
                            }
                        } else {
                            uwVar.finishFragment();
                        }
                    } else {
                        uwVar.finishFragment();
                    }
                }
                return true;
        }
    }

    public a(o0 o0Var, n1 n1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f277a = 14;
        this.f278b = o0Var;
        this.f279c = bundle;
        this.d = resultReceiver;
    }
}
