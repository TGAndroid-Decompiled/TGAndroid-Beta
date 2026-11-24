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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;
public final class ei7 implements Runnable {
    public final byte a;
    public final Object b;

    public ei7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        TLRPC.User W1;
        int R;
        View m;
        int L;
        float f;
        String str;
        int i;
        int i2;
        h74 h74Var;
        boolean z;
        boolean z2;
        float f2 = 1.0f;
        int i3 = 2;
        boolean z3 = true;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ji7 ji7Var = (ji7) this.b;
                String str2 = ji7Var.e2;
                if (str2 != null) {
                    if (ji7Var.h2 >= 0) {
                        ConnectionsManager.getInstance(ji7Var.a).cancelRequest(ji7Var.h2, true);
                        ji7Var.h2 = -1;
                    }
                    Boolean bool = ji7Var.m2;
                    z3 = (bool == null || !bool.booleanValue()) ? false : false;
                    u35 u35Var = new u35(ji7Var, str2, (byte) 8);
                    int i5 = z8c.t0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = bw2.r(i5).f0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        bw2.r(i5).A(0L, false);
                    }
                    oc7 r1 = oc7.r1(i5);
                    String lowerCase = str2.toLowerCase();
                    String I3 = gm.I3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i6);
                            if (tL_contact != null && (W1 = r1.W1(Long.valueOf(tL_contact.user_id))) != null && ((z3 || !W1.bot) && !m9c.C(W1.id) && !m9c.D(W1))) {
                                String lowerCase2 = m9c.r(W1).toLowerCase();
                                String I32 = gm.I3(lowerCase2);
                                if (!lowerCase2.startsWith(lowerCase) && !hg9.s(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                                    if (W1.usernames != null) {
                                        for (int i7 = 0; i7 < W1.usernames.size(); i7++) {
                                            TLRPC.TL_username tL_username = W1.usernames.get(i7);
                                            if (tL_username != null && tL_username.active) {
                                                String lowerCase3 = tL_username.username.toLowerCase();
                                                if (lowerCase3.startsWith(lowerCase) || hg9.s("_", lowerCase, lowerCase3) || lowerCase3.startsWith(I3) || lowerCase3.contains(" ".concat(I3))) {
                                                    arrayList.add(W1);
                                                }
                                            }
                                        }
                                    } else {
                                        String str3 = W1.username;
                                        if (str3 != null) {
                                            String lowerCase4 = str3.toLowerCase();
                                            if (lowerCase4.startsWith(lowerCase) || hg9.s("_", lowerCase, lowerCase4) || lowerCase4.startsWith(I3) || lowerCase4.contains(" ".concat(I3))) {
                                                arrayList.add(W1);
                                            }
                                        }
                                    }
                                } else {
                                    arrayList.add(W1);
                                }
                            }
                        }
                    }
                    u35Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a != null && MediaController.w().v0 != null) {
                    if (MediaController.w().v0.j0 == -9223372036854775807L) {
                        gm.d3(this, 500L);
                        return;
                    }
                    RemoteControlClient.MetadataEditor editMetadata = musicPlayerService.a.editMetadata(false);
                    editMetadata.putLong(9, MediaController.w().v0.j0 * 1000);
                    editMetadata.apply();
                    RemoteControlClient remoteControlClient = musicPlayerService.a;
                    if (!MediaController.w().C()) {
                        i3 = 3;
                    }
                    long max = Math.max(MediaController.w().v0.i0 * 1000, 100L);
                    if (MediaController.w().C()) {
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
                w44 w44Var = ((z8b) this.b).z0;
                if (w44Var instanceof xjb) {
                    ((xjb) w44Var).getEditText();
                    return;
                }
                return;
            case 4:
                kw7 kw7Var = (kw7) this.b;
                if (kw7Var.n && kw7Var.isAttachedToWindow()) {
                    kw7Var.d();
                    kw7Var.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ((by7) this.b).d();
                return;
            case 6:
                a58 a58Var = (a58) this.b;
                if (a58Var.A1 && a58Var.R0) {
                    oab oabVar = ((fab) a58Var.G1).d;
                    oabVar.l1 = false;
                    oabVar.U();
                    return;
                }
                return;
            case 7:
                z68 z68Var = (z68) this.b;
                TextView textView = z68Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                z68Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(z68Var.a, property, 1.0f));
                z68Var.d.setDuration(250L);
                z68Var.d.setInterpolator(new DecelerateInterpolator());
                z68Var.d.addListener(new s38(this, (byte) 3));
                z68Var.d.start();
                return;
            case 8:
                kg8 kg8Var = (kg8) this.b;
                ei7 ei7Var = kg8Var.z0;
                ng8 ng8Var = kg8Var.c0;
                if (ng8Var != null) {
                    EditTextBoldCursor editField = ng8Var.getEditField();
                    if (!kg8Var.V && editField != null && kg8Var.U && !kg8Var.Z && !gm.D && !gm.E && gm.O1()) {
                        editField.requestFocus();
                        gm.E3(editField);
                        gm.r(ei7Var);
                        gm.d3(ei7Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fj8 fj8Var = (fj8) this.b;
                ArrayList arrayList3 = fj8Var.o3;
                if (fj8Var.v3) {
                    if (!arrayList3.isEmpty() && (R = RecyclerView.R((rk8) b10.f(1, arrayList3))) >= 0 && (m = fj8Var.g3.m(R + 1)) != null) {
                        fj8Var.l3 = false;
                        fj8Var.z1(m, true);
                        fj8Var.x0(0, m.getTop() - ((fj8Var.getMeasuredHeight() - m.getMeasuredHeight()) / 2), gm.H);
                    }
                    fj8Var.A1();
                    return;
                }
                return;
            case 10:
                ww8 ww8Var = (ww8) this.b;
                ww8Var.y = true;
                ValueAnimator valueAnimator = ww8Var.z;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ww8Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ww8Var.z = ofFloat;
                ofFloat.addUpdateListener(ww8Var.b0);
                ww8Var.z.setInterpolator(new LinearInterpolator());
                ww8Var.z.setDuration(150L);
                ww8Var.z.start();
                return;
            case 11:
                zx8 zx8Var = (zx8) this.b;
                CameraView cameraView = zx8Var.b;
                if (zx8Var.i0 && cameraView != null) {
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
                        Bitmap bitmap = ((zx8) this.b).l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((zx8) this.b).l0.getHeight() != height) {
                            ((zx8) this.b).l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((zx8) this.b).l0);
                            zx8 zx8Var2 = (zx8) this.b;
                            mj4 f5 = zx8.f(zx8Var2.l0, zx8Var2.j0, zx8Var2.k0, zx8Var2.P);
                            if (f5 != null) {
                                gm.c3(new mn8(this, f5, (byte) 27));
                                return;
                            }
                        } catch (Throwable th) {
                            fc4.g(th, true);
                        }
                    }
                    if (((zx8) this.b).i0) {
                        ((zx8) this.b).h0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                r59 r59Var = (r59) this.b;
                s34 s34Var = r59Var.g2;
                int[] iArr = r59Var.l2;
                yv1 yv1Var = (yv1) s34Var.d;
                iArr[0] = (int) yv1Var.P9;
                iArr[1] = yv1Var.Ya;
                if (r59Var.i2) {
                    L = -gm.L(12.0f);
                    r59Var.N0(0.0f, r59Var.l2[0]);
                } else {
                    L = gm.L(12.0f);
                    r59Var.N0(0.0f, r59Var.getMeasuredHeight() - r59Var.l2[1]);
                }
                ((yv1) r59Var.g2.d).A0.scrollBy(0, L);
                if (r59Var.h2) {
                    gm.c3(r59Var.D2);
                    return;
                }
                return;
            case 13:
                y49 y49Var = (y49) this.b;
                ei7 ei7Var2 = y49Var.j0;
                if (y49Var.n) {
                    gm.r(ei7Var2);
                    gm.d3(ei7Var2, 4000L);
                    return;
                }
                y49Var.V = false;
                y49Var.invalidate();
                return;
            case 14:
                y69 y69Var = (y69) this.b;
                RecyclerView recyclerView = y69Var.a;
                if (recyclerView != null) {
                    if (y69Var.g) {
                        recyclerView.scrollBy(0, -y69Var.i);
                        gm.c3(this);
                        return;
                    } else if (y69Var.h) {
                        recyclerView.scrollBy(0, y69Var.i);
                        gm.c3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                ((pf3) this.b).c();
                return;
            case 16:
                c99 c99Var = (c99) this.b;
                if (c99Var.f && !c99Var.E.E) {
                    c99Var.a();
                    GLES20.glBindFramebuffer(36160, 0);
                    c99 c99Var2 = (c99) this.b;
                    GLES20.glViewport(0, 0, c99Var2.n, c99Var2.r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    hw7 hw7Var = ((c99) this.b).E.c;
                    if (hw7Var.r != null) {
                        if (hw7Var.D != null && hw7Var.F != null && hw7Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            zaa zaaVar = (zaa) hw7Var.r.get("videoBlur");
                            if (zaaVar != null) {
                                GLES20.glUseProgram(zaaVar.a);
                                GLES20.glUniformMatrix4fv(zaaVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(hw7Var.y));
                                GLES20.glUniform1f(zaaVar.d("flipy"), 0.0f);
                                GLES20.glUniform1i(zaaVar.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, hw7Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(zaaVar.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                xm0 xm0Var = hw7Var.F.m;
                                if (xm0Var != null) {
                                    i2 = xm0Var.s[2];
                                } else {
                                    i2 = -1;
                                }
                                GLES20.glBindTexture(3553, i2);
                                if (hw7Var.b != null && (hw7Var.i instanceof q11)) {
                                    GLES20.glUniform1f(zaaVar.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(zaaVar.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, hw7Var.g());
                                } else {
                                    GLES20.glUniform1f(zaaVar.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) hw7Var.m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) hw7Var.n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (hw7Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (hw7Var.b != null) {
                            hw7Var.n(hw7Var.g(), hw7Var.b, (1.0f - (hw7Var.I * 0.5f)) - (hw7Var.J * 0.5f));
                        } else if (hw7Var.c != null) {
                            hw7Var.o(hw7Var.j(), hw7Var.g(), hw7Var.c, 1.0f);
                        } else {
                            int j = hw7Var.j();
                            Map map = hw7Var.r;
                            f = 0.5f;
                            if (hw7Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            zaa zaaVar2 = (zaa) map.get(str);
                            if (j != 0 && zaaVar2 != null) {
                                GLES20.glUseProgram(zaaVar2.a);
                                GLES20.glUniformMatrix4fv(zaaVar2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(hw7Var.y));
                                GLES20.glUniform1f(zaaVar2.d("alpha"), 1.0f);
                                if (hw7Var.G) {
                                    GLES20.glUniform1i(zaaVar2.d("texture"), 1);
                                    GLES20.glUniform1i(zaaVar2.d("mask"), 0);
                                    GLES20.glUniform1f(zaaVar2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, hw7Var.l.c());
                                } else {
                                    GLES20.glUniform1i(zaaVar2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) hw7Var.m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) hw7Var.n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                sze.a();
                            }
                            i = hw7Var.q;
                            if (i != 0 && hw7Var.d != null && hw7Var.I > 0.0f) {
                                hw7Var.o(i, hw7Var.g(), hw7Var.d, (hw7Var.J * f) + (hw7Var.I * f));
                            }
                        }
                        f = 0.5f;
                        i = hw7Var.q;
                        if (i != 0) {
                            hw7Var.o(i, hw7Var.g(), hw7Var.d, (hw7Var.J * f) + (hw7Var.I * f));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    c99 c99Var3 = (c99) this.b;
                    c99Var3.b.eglSwapBuffers(c99Var3.c, c99Var3.e);
                    e99 e99Var = ((c99) this.b).E;
                    if (!e99Var.s) {
                        e99Var.s = true;
                        gm.c3(new pp8(this, (byte) 24));
                    }
                    if (!((c99) this.b).h) {
                        ((c99) this.b).h = true;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((pd9) this.b).h();
                return;
            case 18:
                bj9 bj9Var = (bj9) this.b;
                OverScroller overScroller = bj9Var.n0;
                if (overScroller != null && bj9Var.W != null && overScroller.computeScrollOffset()) {
                    int currX = bj9Var.n0.getCurrX();
                    if (currX >= 0) {
                        i4 = currX;
                    }
                    int i8 = bj9Var.d0;
                    if (i4 > i8) {
                        i4 = i8;
                    }
                    if (i4 != bj9Var.e0) {
                        bj9Var.e0 = i4;
                        bj9Var.W.invalidate();
                    }
                    if (!bj9Var.n0.isFinished()) {
                        bj9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ej9 ej9Var = (ej9) this.b;
                OverScroller overScroller2 = ej9Var.v0;
                if (overScroller2 != null && ej9Var.W != null && overScroller2.computeScrollOffset()) {
                    int currX2 = ej9Var.v0.getCurrX();
                    if (currX2 >= 0) {
                        i4 = currX2;
                    }
                    int i9 = ej9Var.b0;
                    if (i4 > i9) {
                        i4 = i9;
                    }
                    if (i4 != ej9Var.c0) {
                        ej9Var.c0 = i4;
                        ej9Var.Y(ej9Var.T, ej9Var.U, ej9Var.V);
                        ej9Var.W.invalidate();
                    }
                    if (!ej9Var.v0.isFinished()) {
                        ej9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                jj9 jj9Var = (jj9) this.b;
                OverScroller overScroller3 = jj9Var.z0;
                if (overScroller3 != null && jj9Var.W != null && overScroller3.computeScrollOffset()) {
                    int currX3 = jj9Var.z0.getCurrX();
                    if (currX3 >= 0) {
                        i4 = currX3;
                    }
                    int i10 = jj9Var.i0;
                    if (i4 > i10) {
                        i4 = i10;
                    }
                    if (i4 != jj9Var.j0) {
                        jj9Var.j0 = i4;
                        jj9Var.Y(jj9Var.T, jj9Var.U, jj9Var.V);
                        jj9Var.W.invalidate();
                    }
                    if (!jj9Var.z0.isFinished()) {
                        jj9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                un9 un9Var = (un9) this.b;
                if (un9Var.a0 == 5 && (h74Var = un9Var.W) != null && un9Var.z) {
                    long k = h74Var.k();
                    long j2 = un9Var.K;
                    if (k < j2 || k >= un9Var.L) {
                        un9Var.W.k1(j2);
                    }
                    un9Var.d.getClass();
                    un9Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 22:
                tp9 tp9Var = (tp9) this.b;
                wc8 wc8Var = tp9Var.e;
                if (wc8Var != null) {
                    if (!tp9Var.b.a(tp9Var.s)) {
                        rp9 rp9Var = tp9Var.h;
                        if (rp9Var == null) {
                            rp9Var = new rp9();
                            tp9Var.h = rp9Var;
                        }
                        VideoFrame videoFrame = rp9Var.b;
                        if (videoFrame != null) {
                            wc8Var.onFrame(videoFrame);
                        }
                    }
                    gm.d3(this, 500L);
                    return;
                }
                return;
            case 23:
                sp9 sp9Var = (sp9) this.b;
                sp9Var.a();
                if (sp9Var.b) {
                    gm.d3(this, 500L);
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
                    float f6 = scrollSlidingTextTabStrip.T + (((float) elapsedRealtime) / scrollSlidingTextTabStrip.c0);
                    scrollSlidingTextTabStrip.T = f6;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.O.getInterpolation(f6));
                    float f7 = scrollSlidingTextTabStrip.T;
                    if (f7 > 1.0f) {
                        scrollSlidingTextTabStrip.T = 1.0f;
                        f7 = 1.0f;
                    }
                    if (f7 < 1.0f) {
                        gm.c3(scrollSlidingTextTabStrip.e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    kt9 kt9Var = scrollSlidingTextTabStrip.b;
                    if (kt9Var != null) {
                        kt9Var.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                b1a b1aVar = (b1a) this.b;
                String str4 = b1aVar.i2;
                if (str4 != null) {
                    b1aVar.a1(b1aVar.m2, str4, false);
                    return;
                }
                return;
            case 26:
                k3a k3aVar = (k3a) this.b;
                k3aVar.a();
                RectF rectF = k3aVar.r;
                k3aVar.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                gm.d3(k3aVar.E, 1000L);
                return;
            case 27:
                lda ldaVar = (lda) this.b;
                eg0 eg0Var = ldaVar.b;
                if (eg0Var == null) {
                    eg0Var = new eg0(ldaVar, (byte) 4);
                    ldaVar.b = eg0Var;
                }
                int i11 = ldaVar.c + 1;
                ldaVar.c = i11;
                eg0Var.b = i11;
                ldaVar.postDelayed(eg0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                jia jiaVar = (jia) this.b;
                RectF rectF2 = jiaVar.s;
                jiaVar.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                gm.d3(jiaVar.G, 1000L);
                return;
            default:
                ShutterButton shutterButton = (ShutterButton) this.b;
                zia ziaVar = shutterButton.e;
                if (ziaVar != null) {
                    final b62 b62Var = (b62) ziaVar;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = b62Var.e;
                    i22 i22Var = chatAttachAlertPhotoLayout.b;
                    k62 k62Var = chatAttachAlertPhotoLayout.S;
                    byte b = i22Var.N2;
                    d dVar = i22Var.Z1;
                    if ((b == 2 || (dVar instanceof yv1)) && !chatAttachAlertPhotoLayout.t0 && !i22Var.P1 && chatAttachAlertPhotoLayout.Q != null && !i22Var.A1) {
                        if (dVar == null) {
                            dVar = LaunchActivity.Q();
                        }
                        if (dVar != null && dVar.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.x0) {
                                mlb.y(null, 2131749312, new c41(chatAttachAlertPhotoLayout.Q, b62Var.c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                dVar.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(gm.L(30.0f)).setDuration(150L).setInterpolator(d53.f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-gm.L(30.0f)).setDuration(150L);
                                d53 d53Var = d53.f;
                                duration.setInterpolator(d53Var).start();
                                chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                                d dVar2 = i22Var.Z1;
                                if ((dVar2 instanceof yv1) && ((yv1) dVar2).x()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                b62Var.a = gm.s0(z);
                                gm.R3(k62Var, true);
                                k62Var.setText(gm.g0(0, true, false));
                                chatAttachAlertPhotoLayout.h0 = 0;
                                chatAttachAlertPhotoLayout.i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        b62 b62Var2 = b62Var;
                                        switch (b2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = b62Var2.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(gm.g0(i13, true, false));
                                                    gm.d3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                gm.d3(b62Var2.e.i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                gm.d2(dVar.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = b62Var.a;
                                if (i22Var.N2 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z2, new cd1(b62Var, (byte) 18), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        b62 b62Var2 = b62Var;
                                        switch (b2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = b62Var2.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(gm.g0(i13, true, false));
                                                    gm.d3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                gm.d3(b62Var2.e.i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.l0.a(aja.b);
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
