package di;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Dictation.DictationAsr;
public final class a8 implements Runnable {
    public final int f8482a;
    public final Object f8483b;
    public final Object f8484c;
    public final Object d;

    public a8(Object obj, Object obj2, Object obj3, int i7) {
        this.f8482a = i7;
        this.f8483b = obj;
        this.f8484c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        ch.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        org.telegram.ui.Components.o5 o5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        fj fjVar;
        int e12;
        int[] iArr;
        File file;
        int i7;
        boolean contains;
        int i10;
        ConcurrentHashMap concurrentHashMap;
        SQLiteCursor sQLiteCursor;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        Pair pair = null;
        SQLiteCursor sQLiteCursor2 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        boolean z10 = false;
        switch (this.f8482a) {
            case 0:
                y8 y8Var = (y8) this.f8483b;
                Runnable runnable = (Runnable) this.d;
                y8Var.getClass();
                Iterator it = ((HashSet) this.f8484c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    y8Var.Q.remove(num);
                    y8Var.R.remove(num);
                }
                runnable.run();
                return;
            case 1:
                ((boolean[]) this.f8483b)[0] = false;
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.f8484c);
                ((org.telegram.ui.ActionBar.w2[]) this.d)[0].dismiss();
                return;
            case 2:
                fi.b3 b3Var = (fi.b3) this.f8483b;
                ch.p0 p0Var = (ch.p0) this.f8484c;
                View view = (View) this.d;
                fi.z3 z3Var = b3Var.f11759a;
                z3Var.f12826e3 = true;
                fi.x3 x3Var = z3Var.f12899y1;
                ImageReceiver imageReceiver = z3Var.V2;
                boolean[] zArr = {false};
                fi.u6 u6Var = z3Var.f12858o0;
                u6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new fi.f2(1, u6Var)).setDuration(150L).start();
                int L = org.telegram.messenger.g0.L(8.0f);
                fi.u6 u6Var2 = new fi.u6(z3Var.getContext(), z3Var.f12835h1);
                z3Var.f12858o0 = u6Var2;
                u6Var2.setPadding(L, L, L, L);
                z3Var.f12855n0.addView(z3Var.f12858o0, c8.na.e(40, 40, 3));
                org.telegram.ui.Components.o5 o5Var2 = z3Var.Y2;
                if (o5Var2 != null) {
                    o5Var2.n(z3Var);
                    dVar = null;
                    z3Var.Y2 = null;
                } else {
                    dVar = null;
                }
                ch.d dVar2 = z3Var.W2;
                if (dVar2 != null) {
                    dVar2.d(z3Var);
                    z3Var.W2 = dVar;
                }
                z3Var.Z2 = false;
                if (p0Var.f5471g != 0) {
                    z3Var.Z2 = true;
                    org.telegram.ui.Components.o5 o5Var3 = new org.telegram.ui.Components.o5(2, z3Var.f12853m2, p0Var.f5471g);
                    z3Var.Y2 = o5Var3;
                    o5Var3.a(z3Var);
                } else if (p0Var.f5470f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(z3Var.f12853m2).f26734r.get(p0Var.f5470f)) != null) {
                    z3Var.X2.v0(null, null, org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.r0(org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a(), null, null, null, 0);
                    if (imageReceiver.C() != null) {
                        imageReceiver.C().N(0, false, true);
                    }
                }
                z3Var.f12858o0.setReaction(p0Var);
                if (z3Var.n1) {
                    TL_stories.StoryItem storyItem3 = x3Var.f12727a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = x3Var.f12727a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ch.s0.b(null, storyItem4.sent_reaction, storyViews);
                        z3Var.i1(true);
                    }
                }
                if (p0Var.f5471g != 0 && (o5Var = z3Var.f12858o0.f12628f) != null) {
                    ch.d a10 = ch.d.a(o5Var, false, true);
                    z3Var.W2 = a10;
                    a10.f(z3Var);
                }
                z3Var.C1.j0(z3Var.l1, x3Var.f12727a, p0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                z3Var.getLocationInWindow(iArr4);
                z3Var.f12833g3 = iArr3[0] - iArr4[0];
                z3Var.f12837h3 = iArr3[1] - iArr4[1];
                z3Var.f12841i3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z3Var.f12829f3 = 0.0f;
                z3Var.invalidate();
                fi.u6 u6Var3 = z3Var.f12858o0;
                u6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = u6Var3.f12627e;
                if (p0Var.f5471g == 0 && (tL_availableReaction2 = (TLRPC.TL_availableReaction) ri.d0(i10.f24637t0).f26734r.get(p0Var.f5470f)) != null) {
                    imageReceiver2.r0(org.telegram.messenger.fc.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.X(0);
                }
                ofFloat.addUpdateListener(new fi.z2(b3Var, ofFloat, zArr, 0));
                ofFloat.addListener(new fi.a3(b3Var, zArr, u6Var3, 0));
                ofFloat.setDuration(220L);
                ofFloat.start();
                z3Var.Z0(false);
                return;
            case 3:
                fi.r3 r3Var = (fi.r3) this.f8483b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f8484c;
                fi.z3 z3Var2 = r3Var.f12494x;
                org.telegram.ui.Components.b5.P(z3Var2.getContext(), null, i6Var, new a3.h(r3Var, (TL_stories.StoryItem) this.d, i6Var, 7));
                fi.r3 r3Var2 = z3Var2.f12822d1;
                if (r3Var2 != null) {
                    r3Var2.a();
                    return;
                }
                return;
            case 4:
                fi.a6 a6Var = (fi.a6) this.f8483b;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.f8484c;
                w10 w10Var = (w10) this.d;
                for (int i14 = 0; i14 < a6Var.f12051i.size(); i14++) {
                    fj fjVar2 = (fj) a6Var.f12051i.get(i14);
                    if (fjVar2 != null && (storyItem = fjVar2.f24078l) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.f28498id == document.f28498id) {
                        w10Var.a(document2);
                        return;
                    }
                }
                w10Var.a(null);
                return;
            case 5:
                fi.p6 p6Var = (fi.p6) this.f8483b;
                TLObject tLObject = (TLObject) this.f8484c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i15 = p6Var.f12387a;
                p6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    p6Var.S = null;
                    ks.f(i15).k(199, new Object[0]);
                    return;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    p6Var.S = new fi.j6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    ks.f(i15).k(199, new Object[0]);
                    return;
                } else {
                    p6Var.n(tL_error);
                    return;
                }
            case 6:
                fi.z5 z5Var = (fi.z5) this.f8484c;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) this.d;
                ArrayList arrayList2 = ((fi.a6) this.f8483b).f12051i;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    fj fjVar3 = (fj) arrayList2.get(i16);
                    if (fjVar3 != null && (storyItem2 = fjVar3.f24078l) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = z5Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.f28498id == document3.f28498id) {
                                e3Var.a((fi.z5) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.f28516id == photo2.f28516id) {
                            e3Var.a((fi.z5) storyItem2);
                            return;
                        }
                    }
                }
                e3Var.a(null);
                return;
            case 7:
                fi.a6 a6Var2 = (fi.a6) this.f8483b;
                TLObject tLObject2 = (TLObject) this.f8484c;
                Runnable runnable2 = (Runnable) this.d;
                fi.e6 e6Var = a6Var2.f12059q;
                ArrayList arrayList3 = a6Var2.G;
                ArrayList arrayList4 = a6Var2.f12051i;
                ArrayList arrayList5 = a6Var2.H;
                a6Var2.F = 0;
                a6Var2.C = false;
                a6Var2.D = true;
                a6Var2.f12060r = true;
                ArrayList arrayList6 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList7 = ((Vector) tLObject2).objects;
                    int size = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList7.get(i17);
                        i17++;
                        arrayList6.add((TL_bots.botPreviewMedia) obj);
                    }
                } else if (tLObject2 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList3.clear();
                    arrayList3.addAll(previewinfo.lang_codes);
                    arrayList6.addAll(previewinfo.media);
                } else {
                    return;
                }
                ArrayList arrayList8 = new ArrayList(arrayList4);
                arrayList4.clear();
                arrayList5.clear();
                int size2 = arrayList6.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList6.get(i18);
                    i18++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList9 = arrayList6;
                    fj fjVar4 = new fj(a6Var2.f12047c, new fi.z5(a6Var2, a6Var2.d, botpreviewmedia));
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList8.size()) {
                            if (mp.u0(((fj) arrayList8.get(i19)).f24078l.media, botpreviewmedia.media)) {
                                fjVar = (fj) arrayList8.get(i19);
                            } else {
                                i19++;
                            }
                        } else {
                            fjVar = null;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = fjVar4.f24078l;
                    TLRPC.Message message = fjVar4.f24073k;
                    if (fjVar == null) {
                        e12 = a6Var2.I;
                        a6Var2.I = e12 + 1;
                    } else {
                        e12 = fjVar.e1();
                    }
                    message.f28513id = e12;
                    storyItem6.f28731id = e12;
                    fjVar4.f24069j = a6Var2;
                    fjVar4.r0(false);
                    if (arrayList5.isEmpty()) {
                        arrayList5.add(new ArrayList());
                    }
                    ((ArrayList) arrayList5.get(0)).add(Integer.valueOf(fjVar4.e1()));
                    arrayList4.add(fjVar4);
                    arrayList6 = arrayList9;
                }
                org.telegram.messenger.g0.r(e6Var);
                org.telegram.messenger.g0.g3(e6Var);
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
                    return;
                }
                return;
            case 8:
                fi.f9 f9Var = ((fi.w8) this.f8483b).d;
                f9Var.f11989o0.D(f9Var.h, ((fi.h6) this.f8484c).d, (ArrayList) this.d);
                return;
            case 9:
                fi.o9 o9Var = (fi.o9) this.f8483b;
                TLObject tLObject3 = (TLObject) this.f8484c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                f2.a aVar = o9Var.f12358f;
                int i20 = o9Var.f12355b;
                fi.o9.f12353g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    mp.u1(i20).f4(tL_stories_storyViews.users, false);
                    if (!o9Var.d(tL_stories_getStoriesViews.f28739id, tL_stories_storyViews)) {
                        o9Var.d = 0;
                        o9Var.f12357e = false;
                        return;
                    }
                    ks.f(i20).k(327, new Object[0]);
                }
                o9Var.d = 0;
                if (o9Var.f12357e) {
                    org.telegram.messenger.g0.r(aVar);
                    org.telegram.messenger.g0.h3(aVar, 10000L);
                    return;
                }
                return;
            case 10:
                m9.y yVar = (m9.y) this.f8483b;
                m9.e0 e0Var = (m9.e0) this.f8484c;
                try {
                    try {
                        e0Var.o(((m9.q) this.d).apply(c8.u9.a(yVar)));
                        return;
                    } catch (Throwable th2) {
                        e0Var.n(th2);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 11:
                m9.e0 e0Var2 = (m9.e0) this.f8483b;
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.f8484c;
                p4.n1 n1Var = (p4.n1) this.d;
                try {
                    if (!(e0Var2.f21040a instanceof m9.a)) {
                        t1Var.run();
                        e0Var2.m(n1Var);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    e0Var2.n(th3);
                    return;
                }
            case 12:
                hi.f2 f2Var = (hi.f2) this.f8483b;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList10 = f2Var.f14426w;
                hi.g2 g2Var = f2Var.O;
                ArrayList arrayList11 = f2Var.f14425s;
                if (TextUtils.equals((String) this.f8484c, f2Var.I)) {
                    f2Var.f14428y = 0;
                    arrayList11.clear();
                    arrayList10.clear();
                    f2Var.E.clear();
                    f2Var.f14423n.clear();
                    f2Var.f14428y++;
                    arrayList11.add(null);
                    arrayList10.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList11.addAll(tL_messages_stickers.stickers);
                        f2Var.f14428y = tL_messages_stickers.stickers.size() + f2Var.f14428y;
                    }
                    f2Var.J = f2Var.I;
                    f2Var.f();
                    hi.w1.z1(g2Var.f14520b, 0, 0);
                    g2Var.f14523f.c(false);
                    g2Var.f14522e.n(false);
                    return;
                }
                return;
            case 13:
                hi.i3 i3Var = (hi.i3) this.f8483b;
                Object obj3 = this.f8484c;
                String str = (String) this.d;
                float f10 = i3Var.L;
                if (obj3 != null) {
                    int min = (int) Math.min(org.telegram.messenger.g0.f24226q.x / 3.0f, org.telegram.messenger.g0.L(330.0f));
                    if (obj3 instanceof ef) {
                        ef efVar = (ef) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        i3Var.c(efVar, options);
                        hi.x7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c10 = i3Var.c(efVar, options);
                        if (c10 != null && c10.getHeight() / c10.getWidth() < f10) {
                            if (efVar.T == 0 && efVar.U == 0 && !c10.isRecycled()) {
                                iArr2 = c8.k0.b(c10, true);
                                efVar.T = iArr2[0];
                                efVar.U = iArr2[1];
                            } else {
                                int i21 = efVar.T;
                                if (i21 != 0 && (i7 = efVar.U) != 0) {
                                    iArr2 = new int[]{i21, i7};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c10;
                    } else if ((obj3 instanceof hi.x7) && (file = ((hi.x7) obj3).O0) != null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        hi.x7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    } else {
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                org.telegram.messenger.g0.g3(new a8(i3Var, str, pair, 14));
                return;
            case 14:
                hi.i3 i3Var2 = (hi.i3) this.f8483b;
                String str2 = (String) this.f8484c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair2.first;
                int[] iArr5 = (int[]) pair2.second;
                Paint paint = i3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        hi.i3.f14656g0.put(str2, bitmap);
                        HashMap hashMap = hi.i3.f14655f0;
                        Integer num2 = (Integer) hashMap.get(str2);
                        if (num2 != null) {
                            hashMap.put(str2, Integer.valueOf(num2.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (!TextUtils.equals(str2, i3Var2.S)) {
                        hi.i3.d(str2);
                        return;
                    }
                    i3Var2.f14657a = bitmap;
                    if (iArr5 == null) {
                        paint.setShader(null);
                        i3Var2.f14663e = null;
                    } else {
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        i3Var2.f14663e = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    i3Var2.h();
                    i3Var2.invalidate();
                    return;
                }
                return;
            case 15:
                hi.l3 l3Var = (hi.l3) this.f8483b;
                TLObject tLObject5 = (TLObject) this.f8484c;
                mp mpVar = (mp) this.d;
                l3Var.f14836r = true;
                l3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    mpVar.f4(tL_contacts_resolvedPeer.users, false);
                    mpVar.Z3(tL_contacts_resolvedPeer.chats, false);
                    tr.a0(l3Var.f14839x.f14887a).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    l3Var.E();
                    return;
                }
                return;
            case 16:
                hi.r7 r7Var = (hi.r7) this.f8483b;
                ai.q qVar = (ai.q) this.f8484c;
                long[] jArr = (long[]) this.d;
                if (r7Var.f15317t != null && r7Var.f15320x != null) {
                    ai.q[] qVarArr = DictationAsr.f43143a;
                    if (qVar != null && qVar.f1461j) {
                        DictationAsr.K(jArr);
                        r7Var.f15317t.j(jArr[0], jArr[1], true);
                        return;
                    } else if (DictationAsr.A(qVar)) {
                        r7Var.j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                String[] strArr = (String[]) this.f8483b;
                int[][] iArr6 = (int[][]) this.f8484c;
                ai.j jVar = (ai.j) this.d;
                for (int i22 = 0; i22 < strArr.length; i22++) {
                    String str3 = strArr[i22];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr6[i22], 0L);
                    }
                }
                org.telegram.messenger.g0.g3(jVar);
                return;
            case 18:
                AnimatedFileNative.d((String) this.f8483b, ((int[][]) this.f8484c)[0], 0L);
                org.telegram.messenger.g0.g3((ai.j) this.d);
                return;
            case 19:
                hi.f9 f9Var2 = (hi.f9) this.f8483b;
                TLObject tLObject6 = (TLObject) this.f8484c;
                mp mpVar2 = (mp) this.d;
                hi.k9 k9Var = f9Var2.f14495a0;
                f9Var2.f14503w.setLoading(false);
                if (tLObject6 != null) {
                    int i23 = hi.k9.Y1;
                    ArrayList P0 = k9Var.P0();
                    for (int i24 = 0; i24 < P0.size(); i24++) {
                        TLRPC.User user = (TLRPC.User) P0.get(i24);
                        if (user != null && (contains = f9Var2.f14497c.contains(Long.valueOf(user.f28641id))) != user.close_friend) {
                            user.close_friend = contains;
                            if (contains) {
                                i10 = user.flags2 | 4;
                            } else {
                                i10 = user.flags2 & (-5);
                            }
                            user.flags2 = i10;
                            mpVar2.e4(user, false, false);
                        }
                    }
                }
                k9Var.N0();
                if (k9Var.U1) {
                    k9Var.O0(new hi.i9(1, k9Var.f30223a, (ArrayList) null), new fi.o3(k9Var, 1), false);
                    return;
                }
                k9Var.N0();
                k9Var.f14787m1.C(0);
                return;
            case 20:
                ((hi.x7) this.f8484c).O0 = (File) this.d;
                hi.ga gaVar = ((hi.nb) this.f8483b).f15070e1;
                if (gaVar != null) {
                    gaVar.f14529b.f35323g3.O(false);
                    return;
                }
                return;
            case 21:
                hi.nb nbVar = (hi.nb) this.f8483b;
                Bitmap bitmap2 = (Bitmap) this.f8484c;
                Runnable runnable3 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), nbVar.C0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                org.telegram.messenger.g0.g3(runnable3);
                return;
            case 22:
                jg.t tVar = (jg.t) this.d;
                int i25 = ((jg.h0) this.f8483b).f17586t0;
                mp u12 = mp.u1(i25);
                Iterator it2 = ((HashSet) this.f8484c).iterator();
                while (it2.hasNext()) {
                    Pair pair3 = (Pair) it2.next();
                    boolean booleanValue = ((Boolean) pair3.first).booleanValue();
                    Long l10 = (Long) pair3.second;
                    long longValue = l10.longValue();
                    if (booleanValue) {
                        concurrentHashMap = u12.Q;
                    } else {
                        concurrentHashMap = u12.P;
                    }
                    ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    tr a02 = tr.a0(i25);
                    if (booleanValue) {
                        try {
                            sQLiteCursor = a02.f27151b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        i11 = sQLiteCursor.intValue(0);
                                        sQLiteCursor.dispose();
                                    }
                                    i11 = 0;
                                    sQLiteCursor.dispose();
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteCursor2 = sQLiteCursor;
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                a02.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = 0;
                                concurrentHashMap2.put(l10, Integer.valueOf(i11));
                            }
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteCursor = null;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        sQLiteCursor = a02.f27151b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + longValue, new Object[0]);
                        if (sQLiteCursor.next()) {
                            int intValue = sQLiteCursor.intValue(0);
                            int intValue2 = sQLiteCursor.intValue(1);
                            if (intValue2 <= intValue) {
                                i11 = intValue2;
                                sQLiteCursor.dispose();
                            }
                        }
                        i11 = 0;
                        sQLiteCursor.dispose();
                    }
                    concurrentHashMap2.put(l10, Integer.valueOf(i11));
                }
                org.telegram.messenger.g0.g3(tVar);
                return;
            case 23:
                ((jg.f0) this.f8483b).a((a0.h) this.d, (ArrayList) this.f8484c);
                return;
            case 24:
                jg.h1 h1Var = (jg.h1) this.f8483b;
                String str4 = (String) this.f8484c;
                TLObject tLObject7 = (TLObject) this.d;
                h1Var.F0 = 0;
                if (str4.equals(h1Var.E0) && (tLObject7 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject7;
                    ArrayList arrayList12 = h1Var.B0;
                    if (arrayList12 != null) {
                        i12 = arrayList12.size();
                    } else {
                        i12 = 0;
                    }
                    h1Var.F("sticker_search_".concat(str4), tL_messages_stickers2.stickers);
                    ArrayList arrayList13 = h1Var.B0;
                    if (arrayList13 != null) {
                        i13 = arrayList13.size();
                    } else {
                        i13 = 0;
                    }
                    if (!h1Var.f17614p0 && (arrayList = h1Var.B0) != null && !arrayList.isEmpty()) {
                        h1Var.H();
                        n90 n90Var = h1Var.W;
                        if (h1Var.K() > 0) {
                            z10 = true;
                        }
                        n90Var.a(z10);
                        h1Var.f17614p0 = true;
                    }
                    if (i12 != i13) {
                        h1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                jg.h1 h1Var2 = (jg.h1) this.f8483b;
                a0.h hVar = (a0.h) this.d;
                h1Var2.f17615q0 = null;
                h1Var2.Y(hVar, (ArrayList) this.f8484c, true);
                return;
            case 26:
                jg.z1 z1Var = (jg.z1) this.f8483b;
                ArrayList arrayList14 = (ArrayList) this.f8484c;
                z1Var.f17837q = arrayList14;
                z1Var.f17838r = (HashMap) this.d;
                z1Var.f17839s = true;
                z1Var.f17823a.m2(arrayList14);
                return;
            case 27:
                jg.a2 a2Var = (jg.a2) this.f8483b;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str5 = ((TLRPC.TL_messages_searchStickerSets) this.f8484c).f28606q;
                jg.c2 c2Var = a2Var.f17498a;
                String str6 = c2Var.S;
                x31 x31Var = c2Var.f17516e;
                if (str5.equals(str6)) {
                    a2Var.a();
                    x31Var.f41821b.h.getProgressDrawable().f34106e = false;
                    c2Var.O = 0;
                    x31Var.b(true);
                    c2Var.F.addAll(tL_messages_foundStickerSets.sets);
                    c2Var.f();
                    return;
                }
                return;
            case 28:
                kg.c cVar = (kg.c) this.f8483b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f8484c;
                TLObject tLObject8 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.f18354a.b(false);
                    org.telegram.ui.Components.kc.e0(tL_error2);
                    return;
                } else if (tLObject8 instanceof TLRPC.TL_boolFalse) {
                    cVar.f18354a.b(false);
                    org.telegram.messenger.f3.o(null, 2131743632, org.telegram.ui.Components.kc.b0(cVar), null);
                    return;
                } else {
                    cVar.finishFragment();
                    return;
                }
            default:
                kg.n nVar = (kg.n) this.f8483b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f8484c;
                TLObject tLObject9 = (TLObject) this.d;
                if (tL_error3 != null) {
                    nVar.f18481f.b(false);
                    org.telegram.ui.Components.kc.e0(tL_error3);
                    return;
                } else if (tLObject9 instanceof TLRPC.TL_boolFalse) {
                    nVar.f18481f.b(false);
                    org.telegram.messenger.f3.o(null, 2131743632, org.telegram.ui.Components.kc.b0(nVar), null);
                    return;
                } else {
                    if (nVar.F != null) {
                        nVar.getMessagesController().c3(nVar.getUserConfig().f(), 0, true, null);
                    }
                    nVar.finishFragment();
                    return;
                }
        }
    }
}
