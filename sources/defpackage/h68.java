package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s;
import org.telegram.ui.v;
public final class h68 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public h68(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        nr1 nr1Var;
        um4 um4Var;
        um4 um4Var2;
        boolean z;
        boolean z2;
        int i = 0;
        switch (this.a) {
            case 0:
                ((ccb) ((j68) this.b).x.A1).h(new xk8(((lcb) this.c).f, 14, false));
                return;
            case 1:
                ((v98) this.b).s((Bitmap) this.c);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                qe9.Z0(photoViewer.F, photoViewer.l4, false, (x53) this.c, null);
                return;
            case 3:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                tb8 tb8Var = (tb8) this.c;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                if (tb8Var.getWindow() != null) {
                    tb8Var.w0(true);
                    zu1 zu1Var = photoViewer2.k4;
                    if (zu1Var != null && (nr1Var = zu1Var.a0) != null) {
                        nr1Var.N0(false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                ((r4c) this.b).a((Bitmap) this.c);
                return;
            case 5:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                gc8 gc8Var = (gc8) this.c;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                gc8Var.e.h();
                gc8Var.c.postRunnable(new pg6((byte) 1));
                photoViewer3.f0.removeView(photoViewer3.O1);
                return;
            case 6:
                lm lmVar = (lm) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                ArrayList arrayList = lmVar.h;
                im imVar = lmVar.n;
                if (imVar != null) {
                    arrayList.add(imVar);
                }
                im imVar2 = lmVar.r;
                if (imVar2 != null) {
                    arrayList.add(imVar2);
                }
                im imVar3 = lmVar.s;
                if (imVar3 != null) {
                    arrayList.add(imVar3);
                }
                lmVar.n = new im(bitmap);
                lmVar.r = null;
                lmVar.s = null;
                lmVar.t();
                return;
            case 7:
                ((View) this.c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = ((vb8) this.b).c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                zc8 zc8Var = photoViewer4.F2;
                if (zc8Var != null) {
                    zc8Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 8:
                cc8 cc8Var = (cc8) this.b;
                kfc kfcVar = (kfc) this.c;
                if (kfcVar.U() > 0 && kfcVar.S() >= kfcVar.U() - 590) {
                    cc8Var.a.f0.invalidate();
                    return;
                }
                return;
            case 9:
                s sVar = (s) this.b;
                gc8 gc8Var2 = (gc8) this.c;
                gc8Var2.e.h();
                gc8Var2.c.postRunnable(new pg6((byte) 1));
                try {
                    sVar.b.f0.removeView(gc8Var2);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 10:
                ((v) this.b).r.q7.d();
                ((AnimatorSet) this.c).start();
                return;
            case 11:
                fd8 fd8Var = (fd8) this.c;
                ((v) this.b).r.r4 = false;
                if (!fd8Var.s) {
                    fd8Var.a.v0(false, true);
                    return;
                }
                return;
            case 12:
                ne8 ne8Var = (ne8) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                if (ne8Var.a == surfaceTexture && ne8Var.getSurfaceTexture() == null) {
                    ne8Var.setSurfaceTexture(surfaceTexture);
                    return;
                }
                return;
            case 13:
                hl.g((String) this.c);
                ((ji8) this.b).b(true);
                return;
            case 14:
                hl.g(r47.h0(((TLRPC.PollAnswer) this.c).text, false));
                ((ji8) this.b).b(true);
                return;
            case 15:
                ji8 ji8Var = (ji8) this.b;
                byte[] bArr = (byte[]) this.c;
                r7a B = r7a.B(ji8Var.I.K1);
                r47 r47Var = ji8Var.I;
                if (r47Var != null && (r47.m1(r47Var) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = r47.B0(r47Var.k);
                    int e1 = r47Var.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = B.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = e1;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = B.getConnectionsManager();
                    to3 to3Var = Utilities.d;
                    Objects.requireNonNull(to3Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new pe2(to3Var, (byte) 0), new hj8(B, (byte) 20));
                }
                ji8Var.b(true);
                return;
            case 16:
                y99 y99Var = (y99) this.b;
                ib2 ib2Var = (ib2) this.c;
                y99Var.getClass();
                ib2Var.run();
                y99Var.a.remove(ib2Var);
                return;
            case 17:
                mj8 mj8Var = (mj8) this.b;
                TLObject tLObject = (TLObject) this.c;
                mj8Var.N = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    mj8Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        mj8Var.a(false);
                        return;
                    }
                    mj8Var.d();
                    mj8Var.c.g3.O(true);
                    return;
                }
                return;
            case 18:
                ((pcc) this.b).a((Bitmap) this.c);
                return;
            case 19:
                ((mm8) this.b).k((c8b) this.c);
                return;
            case 20:
                c8b c8bVar = (c8b) this.c;
                mm8 mm8Var = (mm8) ((pm3) this.b).d;
                Bitmap bitmap2 = mm8Var.a;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    if (c8bVar.M0 == mm8Var.a) {
                        c8bVar.M0 = null;
                    }
                    mm8Var.a = null;
                    mm8Var.invalidate();
                    return;
                }
                return;
            case 21:
                wm8 wm8Var = (wm8) this.b;
                um8 um8Var = (um8) this.c;
                synchronized (wm8Var.a) {
                    if (!wm8Var.f) {
                        ArrayList arrayList2 = (ArrayList) wm8Var.d.get(um8Var);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                if (((vm8) obj).a != null) {
                                    sm8 sm8Var = (sm8) wm8Var.c.get(um8Var);
                                    if (sm8Var != null) {
                                        um4Var2 = sm8Var.a;
                                    } else if (!wm8Var.a()) {
                                        um4Var2 = new um4((Object) null, wm8Var.n, (byte) 20);
                                    } else {
                                        try {
                                            j26 c = wm8Var.h.a.c(um8Var.a, um8Var.b);
                                            c.b();
                                            um4Var = new um4(c, (Object) null, (byte) 20);
                                        } catch (LinkageError | OutOfMemoryError | RuntimeException e2) {
                                            try {
                                                cc4.g(e2, true);
                                            } catch (LinkageError | RuntimeException unused) {
                                            }
                                            um4Var = new um4((Object) null, e2, (byte) 20);
                                        }
                                        um4Var2 = um4Var;
                                    }
                                    synchronized (wm8Var.a) {
                                        if (!wm8Var.f) {
                                            if (sm8Var == null && ((Throwable) um4Var2.c) == null) {
                                                wm8Var.c(um8Var, um4Var2);
                                            }
                                            ArrayList arrayList3 = (ArrayList) wm8Var.d.remove(um8Var);
                                            if (arrayList3 != null) {
                                                int size2 = arrayList3.size();
                                                while (i < size2) {
                                                    Object obj2 = arrayList3.get(i);
                                                    i++;
                                                    vm8 vm8Var = (vm8) obj2;
                                                    try {
                                                        tm8 tm8Var = vm8Var.a;
                                                        vm8Var.a = null;
                                                        if (tm8Var != null) {
                                                            tm8Var.f(um4Var2);
                                                        }
                                                    } catch (LinkageError | RuntimeException e3) {
                                                        try {
                                                            cc4.g(e3, true);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        wm8Var.d.remove(um8Var);
                        return;
                    }
                    return;
                }
            case 22:
                ((PrivacyControlActivity) this.b).I0((TLObject) this.c);
                return;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.B0();
                    return;
                }
                return;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.B0();
                return;
            case 25:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                boolean z3 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z3;
                ((wkb) this.c).setChecked(z3);
                return;
            case 26:
                ((vn8) this.b).getMessagesController().t5(null, ((Long) this.c).longValue());
                return;
            case 27:
                ap8 ap8Var = (ap8) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = ap8Var.a;
                int i3 = ap8Var.s;
                int size3 = arrayList4.size();
                ap8Var.s = size3;
                if (i3 != size3 && ap8Var.Q != null) {
                    ap8Var.g();
                }
                int size4 = arrayList5.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    xo8 xo8Var = (xo8) arrayList5.get(i4);
                    if (xo8Var.o && !xo8Var.p) {
                        arrayList4.add(xo8Var);
                    } else if (ap8.i(xo8Var.a, arrayList4) == null) {
                        ap8 ap8Var2 = xo8Var.y;
                        float f = ap8Var2.L;
                        RectF rectF = xo8Var.c;
                        RectF rectF2 = xo8Var.f;
                        va6 va6Var = xo8Var.r;
                        if (va6Var != null) {
                            va6Var.a();
                            xo8Var.t = false;
                            xo8Var.s = false;
                        }
                        xo8Var.o = true;
                        if (rectF.left - 1.0f <= f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (rectF.right + 1.0f >= ap8Var2.getMeasuredWidth() - f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z && z2) {
                            z2 = false;
                            z = false;
                        }
                        xo8Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z) {
                            rectF2.right = rectF2.left;
                        } else if (z2) {
                            rectF2.left = rectF2.right;
                        } else {
                            byte b = xo8Var.a;
                            if ((b == 3 || b == 2) && ap8Var2.F == 1) {
                                rectF2.left = rectF2.right;
                            } else {
                                float centerX = rectF2.centerX();
                                rectF2.right = centerX;
                                rectF2.left = centerX;
                            }
                        }
                        xo8Var.e.e(true, 0.0f);
                        arrayList4.add(xo8Var);
                    }
                }
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                ap8Var.invalidate();
                return;
            case 28:
                xo8 xo8Var2 = (xo8) this.c;
                zo8 zo8Var = ((ap8) this.b).y;
                byte b2 = xo8Var2.a;
                RectF rectF3 = xo8Var2.d;
                float f2 = rectF3.left;
                float f3 = rectF3.top;
                ProfileActivity profileActivity = ((bp8) zo8Var).b;
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.u2(f2, f3, b2);
                return;
            default:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                RectF rectF5 = ProfileActivity.Z6;
                long j = profileActivity2.B2;
                if (j != 0) {
                    TLRPC.User X1 = profileActivity2.getMessagesController().X1(Long.valueOf(j));
                    profileActivity2.getMessagesController().d0(profileActivity2.f1, X1);
                    if (profileActivity2.F2 != null && X1 != null && d31.a(profileActivity2)) {
                        d31.D(profileActivity2, X1, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.Z3(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (hl.O1()) {
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f1));
                } else {
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().d0(profileActivity2.f1, profileActivity2.getMessagesController().X1(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.J1 = (byte) 0;
                profileActivity2.finishFragment();
                return;
        }
    }
}
