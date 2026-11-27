package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.RemoteControlClient;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MusicPlayerService;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;
public final class li7 implements Runnable {
    public final byte a;
    public final Object b;

    public li7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        TLRPC.User X1;
        int S;
        View m;
        int L;
        float f;
        String str;
        int i;
        int i2;
        s64 s64Var;
        boolean z;
        boolean z2;
        float f2 = 1.0f;
        int i3 = 2;
        boolean z3 = true;
        int i4 = 0;
        switch (this.a) {
            case 0:
                qi7 qi7Var = (qi7) this.b;
                String str2 = qi7Var.e2;
                if (str2 != null) {
                    if (qi7Var.h2 >= 0) {
                        ConnectionsManager.getInstance(qi7Var.a).cancelRequest(qi7Var.h2, true);
                        qi7Var.h2 = -1;
                    }
                    Boolean bool = qi7Var.m2;
                    z3 = (bool == null || !bool.booleanValue()) ? false : false;
                    v35 v35Var = new v35(qi7Var, str2, (byte) 8);
                    int i5 = yac.t0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = lv2.r(i5).f0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        lv2.r(i5).A(0L, false);
                    }
                    uc7 s1 = uc7.s1(i5);
                    String lowerCase = str2.toLowerCase();
                    String I3 = hl.I3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i6);
                            if (tL_contact != null && (X1 = s1.X1(Long.valueOf(tL_contact.user_id))) != null && ((z3 || !X1.bot) && !lbc.C(X1.id) && !lbc.D(X1))) {
                                String lowerCase2 = lbc.r(X1).toLowerCase();
                                String I32 = hl.I3(lowerCase2);
                                if (!lowerCase2.startsWith(lowerCase) && !uh9.t(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                                    if (X1.usernames != null) {
                                        for (int i7 = 0; i7 < X1.usernames.size(); i7++) {
                                            TLRPC.TL_username tL_username = X1.usernames.get(i7);
                                            if (tL_username != null && tL_username.active) {
                                                String lowerCase3 = tL_username.username.toLowerCase();
                                                if (lowerCase3.startsWith(lowerCase) || uh9.t("_", lowerCase, lowerCase3) || lowerCase3.startsWith(I3) || lowerCase3.contains(" ".concat(I3))) {
                                                    arrayList.add(X1);
                                                }
                                            }
                                        }
                                    } else {
                                        String str3 = X1.username;
                                        if (str3 != null) {
                                            String lowerCase4 = str3.toLowerCase();
                                            if (lowerCase4.startsWith(lowerCase) || uh9.t("_", lowerCase, lowerCase4) || lowerCase4.startsWith(I3) || lowerCase4.contains(" ".concat(I3))) {
                                                arrayList.add(X1);
                                            }
                                        }
                                    }
                                } else {
                                    arrayList.add(X1);
                                }
                            }
                        }
                    }
                    v35Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a != null && MediaController.z().v0 != null) {
                    if (MediaController.z().v0.j0 == -9223372036854775807L) {
                        hl.d3(this, 500L);
                        return;
                    }
                    RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                    editMetadata.putLong(9, MediaController.z().v0.j0 * 1000);
                    editMetadata.apply();
                    RemoteControlClient remoteControlClient = musicPlayerService.a;
                    if (!MediaController.z().G()) {
                        i3 = 3;
                    }
                    long max = Math.max(MediaController.z().v0.i0 * 1000, 100L);
                    if (MediaController.z().G()) {
                        f2 = 0.0f;
                    }
                    remoteControlClient.setPlaybackState(i3, max, f2);
                    return;
                }
                return;
            case 2:
                a.b.sendBroadcast((Intent) this.b);
                return;
            case 3:
                h44 h44Var = ((wab) this.b).t0;
                if (h44Var instanceof rlb) {
                    ((rlb) h44Var).getEditText();
                    return;
                }
                return;
            case 4:
                qx7 qx7Var = (qx7) this.b;
                if (qx7Var.n && qx7Var.isAttachedToWindow()) {
                    qx7Var.d();
                    qx7Var.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ((fz7) this.b).d();
                return;
            case 6:
                o68 o68Var = (o68) this.b;
                if (o68Var.u1 && o68Var.L0) {
                    lcb lcbVar = ((ccb) o68Var.A1).d;
                    lcbVar.l1 = false;
                    lcbVar.U();
                    return;
                }
                return;
            case 7:
                o88 o88Var = (o88) this.b;
                TextView textView = o88Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                o88Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(o88Var.a, property, 1.0f));
                o88Var.d.setDuration(250L);
                o88Var.d.setInterpolator(new DecelerateInterpolator());
                o88Var.d.addListener(new n88(this, (byte) 0));
                o88Var.d.start();
                return;
            case 8:
                wh8 wh8Var = (wh8) this.b;
                li7 li7Var = wh8Var.z0;
                zh8 zh8Var = wh8Var.c0;
                if (zh8Var != null) {
                    EditTextBoldCursor editField = zh8Var.getEditField();
                    if (!wh8Var.V && editField != null && wh8Var.U && !wh8Var.Z && !hl.D && !hl.E && hl.O1()) {
                        editField.requestFocus();
                        hl.E3(editField);
                        hl.r(li7Var);
                        hl.d3(li7Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                rk8 rk8Var = (rk8) this.b;
                ArrayList arrayList3 = rk8Var.o3;
                if (rk8Var.v3) {
                    if (!arrayList3.isEmpty() && (S = RecyclerView.S((cm8) c00.g(1, arrayList3))) >= 0 && (m = rk8Var.g3.m(S + 1)) != null) {
                        rk8Var.l3 = false;
                        rk8Var.A1(m, true);
                        rk8Var.y0(0, m.getTop() - ((rk8Var.getMeasuredHeight() - m.getMeasuredHeight()) / 2), hl.H);
                    }
                    rk8Var.B1();
                    return;
                }
                return;
            case 10:
                ey8 ey8Var = (ey8) this.b;
                ey8Var.y = true;
                ValueAnimator valueAnimator = ey8Var.z;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ey8Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ey8Var.z = ofFloat;
                ofFloat.addUpdateListener(ey8Var.b0);
                ey8Var.z.setInterpolator(new LinearInterpolator());
                ey8Var.z.setDuration(150L);
                ey8Var.z.start();
                return;
            case 11:
                jz8 jz8Var = (jz8) this.b;
                CameraView cameraView = jz8Var.b;
                if (jz8Var.i0 && cameraView != null) {
                    TextureView textureView = cameraView.getTextureView();
                    int width = textureView.getWidth();
                    int height = textureView.getHeight();
                    if (width > 0 && height > 0) {
                        if (width > 720 || height > 720) {
                            float f3 = width;
                            float f4 = height;
                            float min = Math.min(720.0f / f3, 720.0f / f4);
                            width = Math.max(1, (int) (f3 * min));
                            height = Math.max(1, (int) (f4 * min));
                        }
                        Bitmap bitmap = ((jz8) this.b).l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((jz8) this.b).l0.getHeight() != height) {
                            ((jz8) this.b).l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((jz8) this.b).l0);
                            jz8 jz8Var2 = (jz8) this.b;
                            ym4 f5 = jz8.f(jz8Var2.l0, jz8Var2.j0, jz8Var2.k0, jz8Var2.P);
                            if (f5 != null) {
                                hl.c3(new ep8(this, f5, (byte) 24));
                                return;
                            }
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    if (((jz8) this.b).i0) {
                        ((jz8) this.b).h0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                d79 d79Var = (d79) this.b;
                c34 c34Var = d79Var.g2;
                int[] iArr = d79Var.l2;
                zu1 zu1Var = (zu1) c34Var.d;
                iArr[0] = (int) zu1Var.P9;
                iArr[1] = zu1Var.Ya;
                if (d79Var.i2) {
                    L = -hl.L(12.0f);
                    d79Var.O0(0.0f, d79Var.l2[0]);
                } else {
                    L = hl.L(12.0f);
                    d79Var.O0(0.0f, d79Var.getMeasuredHeight() - d79Var.l2[1]);
                }
                ((zu1) d79Var.g2.d).A0.scrollBy(0, L);
                if (d79Var.h2) {
                    hl.c3(d79Var.D2);
                    return;
                }
                return;
            case 13:
                k69 k69Var = (k69) this.b;
                li7 li7Var2 = k69Var.j0;
                if (k69Var.n) {
                    hl.r(li7Var2);
                    hl.d3(li7Var2, 4000L);
                    return;
                }
                k69Var.V = false;
                k69Var.invalidate();
                return;
            case 14:
                j89 j89Var = (j89) this.b;
                RecyclerView recyclerView = j89Var.a;
                if (recyclerView != null) {
                    if (j89Var.g) {
                        recyclerView.scrollBy(0, -j89Var.i);
                        hl.c3(this);
                        return;
                    } else if (j89Var.h) {
                        recyclerView.scrollBy(0, j89Var.i);
                        hl.c3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                ((ye3) this.b).c();
                return;
            case 16:
                na9 na9Var = (na9) this.b;
                if (na9Var.f && !na9Var.E.E) {
                    na9Var.a();
                    GLES20.glBindFramebuffer(36160, 0);
                    na9 na9Var2 = (na9) this.b;
                    GLES20.glViewport(0, 0, na9Var2.n, na9Var2.r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    nx7 nx7Var = ((na9) this.b).E.c;
                    if (nx7Var.r != null) {
                        if (nx7Var.D != null && nx7Var.F != null && nx7Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            qca qcaVar = (qca) nx7Var.r.get("videoBlur");
                            if (qcaVar != null) {
                                GLES20.glUseProgram(qcaVar.a);
                                GLES20.glUniformMatrix4fv(qcaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(nx7Var.y));
                                GLES20.glUniform1f(qcaVar.d("flipy"), 0.0f);
                                GLES20.glUniform1i(qcaVar.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, nx7Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(qcaVar.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                yl0 yl0Var = nx7Var.F.m;
                                if (yl0Var != null) {
                                    i2 = yl0Var.s[2];
                                } else {
                                    i2 = -1;
                                }
                                GLES20.glBindTexture(3553, i2);
                                if (nx7Var.b != null && (nx7Var.i instanceof r01)) {
                                    GLES20.glUniform1f(qcaVar.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(qcaVar.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, nx7Var.g());
                                } else {
                                    GLES20.glUniform1f(qcaVar.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) nx7Var.m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) nx7Var.n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (nx7Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (nx7Var.b != null) {
                            nx7Var.n(nx7Var.g(), nx7Var.b, (1.0f - (nx7Var.I * 0.5f)) - (nx7Var.J * 0.5f));
                        } else if (nx7Var.c != null) {
                            nx7Var.o(nx7Var.j(), nx7Var.g(), nx7Var.c, 1.0f);
                        } else {
                            int j = nx7Var.j();
                            f = 0.5f;
                            Map map = nx7Var.r;
                            if (nx7Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            qca qcaVar2 = (qca) map.get(str);
                            if (j != 0 && qcaVar2 != null) {
                                GLES20.glUseProgram(qcaVar2.a);
                                GLES20.glUniformMatrix4fv(qcaVar2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(nx7Var.y));
                                GLES20.glUniform1f(qcaVar2.d("alpha"), 1.0f);
                                if (nx7Var.G) {
                                    GLES20.glUniform1i(qcaVar2.d("texture"), 1);
                                    GLES20.glUniform1i(qcaVar2.d("mask"), 0);
                                    GLES20.glUniform1f(qcaVar2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, nx7Var.l.c());
                                } else {
                                    GLES20.glUniform1i(qcaVar2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) nx7Var.m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) nx7Var.n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                k2f.a();
                            }
                            i = nx7Var.q;
                            if (i != 0 && nx7Var.d != null && nx7Var.I > 0.0f) {
                                nx7Var.o(i, nx7Var.g(), nx7Var.d, (nx7Var.J * f) + (nx7Var.I * f));
                            }
                        }
                        f = 0.5f;
                        i = nx7Var.q;
                        if (i != 0) {
                            nx7Var.o(i, nx7Var.g(), nx7Var.d, (nx7Var.J * f) + (nx7Var.I * f));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    na9 na9Var3 = (na9) this.b;
                    na9Var3.b.eglSwapBuffers(na9Var3.c, na9Var3.e);
                    pa9 pa9Var = ((na9) this.b).E;
                    if (!pa9Var.s) {
                        pa9Var.s = true;
                        hl.c3(new v59(this, (byte) 2));
                    }
                    if (!((na9) this.b).h) {
                        ((na9) this.b).h = true;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((ff9) this.b).h();
                return;
            case 18:
                ok9 ok9Var = (ok9) this.b;
                OverScroller overScroller = ok9Var.n0;
                if (overScroller != null && ok9Var.W != null && overScroller.computeScrollOffset()) {
                    int currX = ok9Var.n0.getCurrX();
                    if (currX >= 0) {
                        i4 = currX;
                    }
                    int i8 = ok9Var.d0;
                    if (i4 > i8) {
                        i4 = i8;
                    }
                    if (i4 != ok9Var.e0) {
                        ok9Var.e0 = i4;
                        ok9Var.W.invalidate();
                    }
                    if (!ok9Var.n0.isFinished()) {
                        ok9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                rk9 rk9Var = (rk9) this.b;
                OverScroller overScroller2 = rk9Var.v0;
                if (overScroller2 != null && rk9Var.W != null && overScroller2.computeScrollOffset()) {
                    int currX2 = rk9Var.v0.getCurrX();
                    if (currX2 >= 0) {
                        i4 = currX2;
                    }
                    int i9 = rk9Var.b0;
                    if (i4 > i9) {
                        i4 = i9;
                    }
                    if (i4 != rk9Var.c0) {
                        rk9Var.c0 = i4;
                        rk9Var.Y(rk9Var.T, rk9Var.U, rk9Var.V);
                        rk9Var.W.invalidate();
                    }
                    if (!rk9Var.v0.isFinished()) {
                        rk9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                wk9 wk9Var = (wk9) this.b;
                OverScroller overScroller3 = wk9Var.z0;
                if (overScroller3 != null && wk9Var.W != null && overScroller3.computeScrollOffset()) {
                    int currX3 = wk9Var.z0.getCurrX();
                    if (currX3 >= 0) {
                        i4 = currX3;
                    }
                    int i10 = wk9Var.i0;
                    if (i4 > i10) {
                        i4 = i10;
                    }
                    if (i4 != wk9Var.j0) {
                        wk9Var.j0 = i4;
                        wk9Var.Y(wk9Var.T, wk9Var.U, wk9Var.V);
                        wk9Var.W.invalidate();
                    }
                    if (!wk9Var.z0.isFinished()) {
                        wk9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                jp9 jp9Var = (jp9) this.b;
                if (jp9Var.a0 == 5 && (s64Var = jp9Var.W) != null && jp9Var.z) {
                    long k = s64Var.k();
                    long j2 = jp9Var.K;
                    if (k < j2 || k >= jp9Var.L) {
                        jp9Var.W.k1(j2);
                    }
                    jp9Var.d.getClass();
                    jp9Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 22:
                ir9 ir9Var = (ir9) this.b;
                ke8 ke8Var = ir9Var.e;
                if (ke8Var != null) {
                    if (!ir9Var.b.a(ir9Var.s)) {
                        gr9 gr9Var = ir9Var.h;
                        if (gr9Var == null) {
                            gr9Var = new gr9();
                            ir9Var.h = gr9Var;
                        }
                        VideoFrame videoFrame = gr9Var.b;
                        if (videoFrame != null) {
                            ke8Var.onFrame(videoFrame);
                        }
                    }
                    hl.d3(this, 500L);
                    return;
                }
                return;
            case 23:
                hr9 hr9Var = (hr9) this.b;
                hr9Var.a();
                if (hr9Var.b) {
                    hl.d3(this, 500L);
                    return;
                }
                return;
            case 24:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.I) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f6 = (((float) elapsedRealtime) / scrollSlidingTextTabStrip.c0) + scrollSlidingTextTabStrip.T;
                    scrollSlidingTextTabStrip.T = f6;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f6));
                    float f7 = scrollSlidingTextTabStrip.T;
                    if (f7 > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                        f7 = 1.0f;
                    }
                    if (f7 < 1.0f) {
                        hl.c3(scrollSlidingTextTabStrip.e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    bv9 bv9Var = scrollSlidingTextTabStrip.b;
                    if (bv9Var != null) {
                        bv9Var.a(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                t2a t2aVar = (t2a) this.b;
                String str4 = t2aVar.i2;
                if (str4 != null) {
                    t2aVar.b1(t2aVar.m2, str4, false);
                    return;
                }
                return;
            case 26:
                b5a b5aVar = (b5a) this.b;
                b5aVar.a();
                RectF rectF = b5aVar.r;
                b5aVar.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                hl.d3(b5aVar.E, 1000L);
                return;
            case 27:
                cfa cfaVar = (cfa) this.b;
                gf0 gf0Var = cfaVar.b;
                if (gf0Var == null) {
                    gf0Var = new gf0(cfaVar, (byte) 4);
                    cfaVar.b = gf0Var;
                }
                int i11 = cfaVar.c + 1;
                cfaVar.c = i11;
                gf0Var.b = i11;
                cfaVar.postDelayed(gf0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                aka akaVar = (aka) this.b;
                RectF rectF2 = akaVar.s;
                akaVar.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                hl.d3(akaVar.G, 1000L);
                return;
            default:
                ShutterButton shutterButton = (ShutterButton) this.b;
                qka qkaVar = shutterButton.e;
                if (qkaVar != null) {
                    final g52 g52Var = (g52) qkaVar;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = g52Var.e;
                    n12 n12Var = chatAttachAlertPhotoLayout.b;
                    p52 p52Var = chatAttachAlertPhotoLayout.S;
                    byte b = n12Var.N2;
                    e eVar = n12Var.Z1;
                    if ((b == 2 || (eVar instanceof zu1)) && !chatAttachAlertPhotoLayout.t0 && !n12Var.P1 && chatAttachAlertPhotoLayout.Q != null && !n12Var.A1) {
                        if (eVar == null) {
                            eVar = LaunchActivity.Q();
                        }
                        if (eVar != null && eVar.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.x0) {
                                xnb.x(null, 2131749309, new d31(chatAttachAlertPhotoLayout.Q, g52Var.c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                eVar.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(hl.L(30.0f)).setDuration(150L).setInterpolator(k43.f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-hl.L(30.0f)).setDuration(150L);
                                k43 k43Var = k43.f;
                                duration.setInterpolator(k43Var).start();
                                chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                                e eVar2 = n12Var.Z1;
                                if ((eVar2 instanceof zu1) && ((zu1) eVar2).y()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                g52Var.a = hl.s0(z);
                                hl.R3(p52Var, true);
                                p52Var.setText(hl.g0(0, true, false));
                                chatAttachAlertPhotoLayout.h0 = 0;
                                chatAttachAlertPhotoLayout.i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        g52 g52Var2 = g52Var;
                                        switch (b2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = g52Var2.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(hl.g0(i13, true, false));
                                                    hl.d3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                hl.d3(g52Var2.e.i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                hl.d2(eVar.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = g52Var.a;
                                if (n12Var.N2 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z2, new rd1(g52Var, (byte) 17), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        g52 g52Var2 = g52Var;
                                        switch (b2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = g52Var2.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(hl.g0(i13, true, false));
                                                    hl.d3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                hl.d3(g52Var2.e.i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.l0.a(rka.b);
                                chatAttachAlertPhotoLayout.Q.runHaptic();
                                return;
                            }
                        }
                    }
                    shutterButton.w = false;
                    return;
                }
                return;
        }
    }
}
