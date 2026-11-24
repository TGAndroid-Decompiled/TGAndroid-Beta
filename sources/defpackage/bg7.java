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
public final class bg7 implements Runnable {
    public final byte a;
    public final Object b;

    public bg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        TLRPC.User V1;
        int R;
        View m;
        int L;
        float f;
        String str;
        int i;
        int i2;
        y54 y54Var;
        boolean z;
        boolean z2;
        float f2 = 1.0f;
        int i3 = 2;
        boolean z3 = true;
        int i4 = 0;
        switch (this.a) {
            case 0:
                gg7 gg7Var = (gg7) this.b;
                String str2 = gg7Var.e2;
                if (str2 != null) {
                    if (gg7Var.h2 >= 0) {
                        ConnectionsManager.getInstance(gg7Var.a).cancelRequest(gg7Var.h2, true);
                        gg7Var.h2 = -1;
                    }
                    Boolean bool = gg7Var.m2;
                    z3 = (bool == null || !bool.booleanValue()) ? false : false;
                    x15 x15Var = new x15(gg7Var, str2, (byte) 7);
                    int i5 = y6c.t0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = qu2.r(i5).f0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        qu2.r(i5).A(0L, false);
                    }
                    na7 q1 = na7.q1(i5);
                    String lowerCase = str2.toLowerCase();
                    String I3 = gl.I3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i6);
                            if (tL_contact != null && (V1 = q1.V1(Long.valueOf(tL_contact.user_id))) != null && ((z3 || !V1.bot) && !l7c.C(V1.id) && !l7c.D(V1))) {
                                String lowerCase2 = l7c.r(V1).toLowerCase();
                                String I32 = gl.I3(lowerCase2);
                                if (!lowerCase2.startsWith(lowerCase) && !de9.t(" ", lowerCase, lowerCase2) && !I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                                    if (V1.usernames != null) {
                                        for (int i7 = 0; i7 < V1.usernames.size(); i7++) {
                                            TLRPC.TL_username tL_username = V1.usernames.get(i7);
                                            if (tL_username != null && tL_username.active) {
                                                String lowerCase3 = tL_username.username.toLowerCase();
                                                if (lowerCase3.startsWith(lowerCase) || de9.t("_", lowerCase, lowerCase3) || lowerCase3.startsWith(I3) || lowerCase3.contains(" ".concat(I3))) {
                                                    arrayList.add(V1);
                                                }
                                            }
                                        }
                                    } else {
                                        String str3 = V1.username;
                                        if (str3 != null) {
                                            String lowerCase4 = str3.toLowerCase();
                                            if (lowerCase4.startsWith(lowerCase) || de9.t("_", lowerCase, lowerCase4) || lowerCase4.startsWith(I3) || lowerCase4.contains(" ".concat(I3))) {
                                                arrayList.add(V1);
                                            }
                                        }
                                    }
                                } else {
                                    arrayList.add(V1);
                                }
                            }
                        }
                    }
                    x15Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                MusicPlayerService musicPlayerService = (MusicPlayerService) this.b;
                if (musicPlayerService.a != null && MediaController.w().v0 != null) {
                    if (MediaController.w().v0.j0 == -9223372036854775807L) {
                        gl.d3(this, 500L);
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
                l34 l34Var = ((x6b) this.b).z0;
                if (l34Var instanceof vhb) {
                    ((vhb) l34Var).getEditText();
                    return;
                }
                return;
            case 4:
                ju7 ju7Var = (ju7) this.b;
                if (ju7Var.n && ju7Var.isAttachedToWindow()) {
                    ju7Var.d();
                    ju7Var.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ((yv7) this.b).d();
                return;
            case 6:
                y28 y28Var = (y28) this.b;
                if (y28Var.A1 && y28Var.R0) {
                    m8b m8bVar = ((d8b) y28Var.G1).d;
                    m8bVar.l1 = false;
                    m8bVar.U();
                    return;
                }
                return;
            case 7:
                x48 x48Var = (x48) this.b;
                TextView textView = x48Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                x48Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, property, 0.0f), ObjectAnimator.ofFloat(x48Var.a, property, 1.0f));
                x48Var.d.setDuration(250L);
                x48Var.d.setInterpolator(new DecelerateInterpolator());
                x48Var.d.addListener(new l48(this, (byte) 1));
                x48Var.d.start();
                return;
            case 8:
                ie8 ie8Var = (ie8) this.b;
                bg7 bg7Var = ie8Var.z0;
                le8 le8Var = ie8Var.c0;
                if (le8Var != null) {
                    EditTextBoldCursor editField = le8Var.getEditField();
                    if (!ie8Var.V && editField != null && ie8Var.U && !ie8Var.Z && !gl.D && !gl.E && gl.O1()) {
                        editField.requestFocus();
                        gl.E3(editField);
                        gl.r(bg7Var);
                        gl.d3(bg7Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                dh8 dh8Var = (dh8) this.b;
                ArrayList arrayList3 = dh8Var.o3;
                if (dh8Var.v3) {
                    if (!arrayList3.isEmpty() && (R = RecyclerView.R((pi8) b00.f(1, arrayList3))) >= 0 && (m = dh8Var.g3.m(R + 1)) != null) {
                        dh8Var.l3 = false;
                        dh8Var.z1(m, true);
                        dh8Var.x0(0, m.getTop() - ((dh8Var.getMeasuredHeight() - m.getMeasuredHeight()) / 2), gl.H);
                    }
                    dh8Var.A1();
                    return;
                }
                return;
            case 10:
                vu8 vu8Var = (vu8) this.b;
                vu8Var.y = true;
                ValueAnimator valueAnimator = vu8Var.z;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                vu8Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vu8Var.z = ofFloat;
                ofFloat.addUpdateListener(vu8Var.b0);
                vu8Var.z.setInterpolator(new LinearInterpolator());
                vu8Var.z.setDuration(150L);
                vu8Var.z.start();
                return;
            case 11:
                yv8 yv8Var = (yv8) this.b;
                CameraView cameraView = yv8Var.b;
                if (yv8Var.i0 && cameraView != null) {
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
                        Bitmap bitmap = ((yv8) this.b).l0;
                        if (bitmap == null || bitmap.getWidth() != width || ((yv8) this.b).l0.getHeight() != height) {
                            ((yv8) this.b).l0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                        }
                        try {
                            textureView.getBitmap(((yv8) this.b).l0);
                            yv8 yv8Var2 = (yv8) this.b;
                            sk4 f5 = yv8.f(yv8Var2.l0, yv8Var2.j0, yv8Var2.k0, yv8Var2.P);
                            if (f5 != null) {
                                gl.c3(new ll8(this, f5, (byte) 25));
                                return;
                            }
                        } catch (Throwable th) {
                            fa4.g(th, true);
                        }
                    }
                    if (((yv8) this.b).i0) {
                        ((yv8) this.b).h0.postDelayed(this, 150L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                o39 o39Var = (o39) this.b;
                h24 h24Var = o39Var.g2;
                int[] iArr = o39Var.l2;
                mu1 mu1Var = (mu1) h24Var.d;
                iArr[0] = (int) mu1Var.P9;
                iArr[1] = mu1Var.Ya;
                if (o39Var.i2) {
                    L = -gl.L(12.0f);
                    o39Var.N0(0.0f, o39Var.l2[0]);
                } else {
                    L = gl.L(12.0f);
                    o39Var.N0(0.0f, o39Var.getMeasuredHeight() - o39Var.l2[1]);
                }
                ((mu1) o39Var.g2.d).A0.scrollBy(0, L);
                if (o39Var.h2) {
                    gl.c3(o39Var.D2);
                    return;
                }
                return;
            case 13:
                v29 v29Var = (v29) this.b;
                bg7 bg7Var2 = v29Var.j0;
                if (v29Var.n) {
                    gl.r(bg7Var2);
                    gl.d3(bg7Var2, 4000L);
                    return;
                }
                v29Var.V = false;
                v29Var.invalidate();
                return;
            case 14:
                w49 w49Var = (w49) this.b;
                RecyclerView recyclerView = w49Var.a;
                if (recyclerView != null) {
                    if (w49Var.g) {
                        recyclerView.scrollBy(0, -w49Var.i);
                        gl.c3(this);
                        return;
                    } else if (w49Var.h) {
                        recyclerView.scrollBy(0, w49Var.i);
                        gl.c3(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                ((ee3) this.b).c();
                return;
            case 16:
                a79 a79Var = (a79) this.b;
                if (a79Var.f && !a79Var.E.E) {
                    a79Var.a();
                    GLES20.glBindFramebuffer(36160, 0);
                    a79 a79Var2 = (a79) this.b;
                    GLES20.glViewport(0, 0, a79Var2.n, a79Var2.r);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    gu7 gu7Var = ((a79) this.b).E.c;
                    if (gu7Var.r != null) {
                        if (gu7Var.D != null && gu7Var.F != null && gu7Var.E) {
                            GLES20.glBindFramebuffer(36160, 0);
                            z8a z8aVar = (z8a) gu7Var.r.get("videoBlur");
                            if (z8aVar != null) {
                                GLES20.glUseProgram(z8aVar.a);
                                GLES20.glUniformMatrix4fv(z8aVar.d("mvpMatrix"), 1, false, FloatBuffer.wrap(gu7Var.y));
                                GLES20.glUniform1f(z8aVar.d("flipy"), 0.0f);
                                GLES20.glUniform1i(z8aVar.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, gu7Var.D.c());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(z8aVar.d("blured"), 1);
                                GLES20.glActiveTexture(33985);
                                xl0 xl0Var = gu7Var.F.m;
                                if (xl0Var != null) {
                                    i2 = xl0Var.s[2];
                                } else {
                                    i2 = -1;
                                }
                                GLES20.glBindTexture(3553, i2);
                                if (gu7Var.b != null && (gu7Var.i instanceof i01)) {
                                    GLES20.glUniform1f(z8aVar.d("eraser"), 1.0f);
                                    GLES20.glUniform1i(z8aVar.d("mask"), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, gu7Var.g());
                                } else {
                                    GLES20.glUniform1f(z8aVar.d("eraser"), 0.0f);
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) gu7Var.m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) gu7Var.n);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (gu7Var.F.h) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (gu7Var.b != null) {
                            gu7Var.n(gu7Var.g(), gu7Var.b, (1.0f - (gu7Var.I * 0.5f)) - (gu7Var.J * 0.5f));
                        } else if (gu7Var.c != null) {
                            gu7Var.o(gu7Var.j(), gu7Var.g(), gu7Var.c, 1.0f);
                        } else {
                            int j = gu7Var.j();
                            Map map = gu7Var.r;
                            f = 0.5f;
                            if (gu7Var.G) {
                                str = "maskingBlit";
                            } else {
                                str = "blit";
                            }
                            z8a z8aVar2 = (z8a) map.get(str);
                            if (j != 0 && z8aVar2 != null) {
                                GLES20.glUseProgram(z8aVar2.a);
                                GLES20.glUniformMatrix4fv(z8aVar2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(gu7Var.y));
                                GLES20.glUniform1f(z8aVar2.d("alpha"), 1.0f);
                                if (gu7Var.G) {
                                    GLES20.glUniform1i(z8aVar2.d("texture"), 1);
                                    GLES20.glUniform1i(z8aVar2.d("mask"), 0);
                                    GLES20.glUniform1f(z8aVar2.d("preview"), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, gu7Var.l.c());
                                } else {
                                    GLES20.glUniform1i(z8aVar2.d("texture"), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, j);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) gu7Var.m);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) gu7Var.n);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                qxe.a();
                            }
                            i = gu7Var.q;
                            if (i != 0 && gu7Var.d != null && gu7Var.I > 0.0f) {
                                gu7Var.o(i, gu7Var.g(), gu7Var.d, (gu7Var.J * f) + (gu7Var.I * f));
                            }
                        }
                        f = 0.5f;
                        i = gu7Var.q;
                        if (i != 0) {
                            gu7Var.o(i, gu7Var.g(), gu7Var.d, (gu7Var.J * f) + (gu7Var.I * f));
                        }
                    }
                    GLES20.glBlendFunc(1, 771);
                    a79 a79Var3 = (a79) this.b;
                    a79Var3.b.eglSwapBuffers(a79Var3.c, a79Var3.e);
                    c79 c79Var = ((a79) this.b).E;
                    if (!c79Var.s) {
                        c79Var.s = true;
                        gl.c3(new sr8(this, (byte) 16));
                    }
                    if (!((a79) this.b).h) {
                        ((a79) this.b).h = true;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((pb9) this.b).h();
                return;
            case 18:
                yg9 yg9Var = (yg9) this.b;
                OverScroller overScroller = yg9Var.n0;
                if (overScroller != null && yg9Var.W != null && overScroller.computeScrollOffset()) {
                    int currX = yg9Var.n0.getCurrX();
                    if (currX >= 0) {
                        i4 = currX;
                    }
                    int i8 = yg9Var.d0;
                    if (i4 > i8) {
                        i4 = i8;
                    }
                    if (i4 != yg9Var.e0) {
                        yg9Var.e0 = i4;
                        yg9Var.W.invalidate();
                    }
                    if (!yg9Var.n0.isFinished()) {
                        yg9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                bh9 bh9Var = (bh9) this.b;
                OverScroller overScroller2 = bh9Var.v0;
                if (overScroller2 != null && bh9Var.W != null && overScroller2.computeScrollOffset()) {
                    int currX2 = bh9Var.v0.getCurrX();
                    if (currX2 >= 0) {
                        i4 = currX2;
                    }
                    int i9 = bh9Var.b0;
                    if (i4 > i9) {
                        i4 = i9;
                    }
                    if (i4 != bh9Var.c0) {
                        bh9Var.c0 = i4;
                        bh9Var.Z(bh9Var.T, bh9Var.U, bh9Var.V);
                        bh9Var.W.invalidate();
                    }
                    if (!bh9Var.v0.isFinished()) {
                        bh9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                gh9 gh9Var = (gh9) this.b;
                OverScroller overScroller3 = gh9Var.z0;
                if (overScroller3 != null && gh9Var.W != null && overScroller3.computeScrollOffset()) {
                    int currX3 = gh9Var.z0.getCurrX();
                    if (currX3 >= 0) {
                        i4 = currX3;
                    }
                    int i10 = gh9Var.i0;
                    if (i4 > i10) {
                        i4 = i10;
                    }
                    if (i4 != gh9Var.j0) {
                        gh9Var.j0 = i4;
                        gh9Var.Z(gh9Var.T, gh9Var.U, gh9Var.V);
                        gh9Var.W.invalidate();
                    }
                    if (!gh9Var.z0.isFinished()) {
                        gh9Var.W.postOnAnimation(this);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ul9 ul9Var = (ul9) this.b;
                if (ul9Var.a0 == 5 && (y54Var = ul9Var.W) != null && ul9Var.z) {
                    long m2 = y54Var.m();
                    long j2 = ul9Var.K;
                    if (m2 < j2 || m2 >= ul9Var.L) {
                        ul9Var.W.k1(j2);
                    }
                    ul9Var.d.getClass();
                    ul9Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 22:
                sn9 sn9Var = (sn9) this.b;
                ta8 ta8Var = sn9Var.e;
                if (ta8Var != null) {
                    if (!sn9Var.b.a(sn9Var.s)) {
                        qn9 qn9Var = sn9Var.h;
                        if (qn9Var == null) {
                            qn9Var = new qn9();
                            sn9Var.h = qn9Var;
                        }
                        VideoFrame videoFrame = qn9Var.b;
                        if (videoFrame != null) {
                            ta8Var.onFrame(videoFrame);
                        }
                    }
                    gl.d3(this, 500L);
                    return;
                }
                return;
            case 23:
                rn9 rn9Var = (rn9) this.b;
                rn9Var.a();
                if (rn9Var.b) {
                    gl.d3(this, 500L);
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
                        gl.c3(scrollSlidingTextTabStrip.e0);
                        return;
                    }
                    scrollSlidingTextTabStrip.I = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    ir9 ir9Var = scrollSlidingTextTabStrip.b;
                    if (ir9Var != null) {
                        ir9Var.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                zy9 zy9Var = (zy9) this.b;
                String str4 = zy9Var.i2;
                if (str4 != null) {
                    zy9Var.a1(zy9Var.m2, str4, false);
                    return;
                }
                return;
            case 26:
                i1a i1aVar = (i1a) this.b;
                i1aVar.a();
                RectF rectF = i1aVar.r;
                i1aVar.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                gl.d3(i1aVar.E, 1000L);
                return;
            case 27:
                lba lbaVar = (lba) this.b;
                ef0 ef0Var = lbaVar.b;
                if (ef0Var == null) {
                    ef0Var = new ef0(lbaVar, (byte) 4);
                    lbaVar.b = ef0Var;
                }
                int i11 = lbaVar.c + 1;
                lbaVar.c = i11;
                ef0Var.b = i11;
                lbaVar.postDelayed(ef0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 28:
                hga hgaVar = (hga) this.b;
                RectF rectF2 = hgaVar.s;
                hgaVar.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                gl.d3(hgaVar.G, 1000L);
                return;
            default:
                ShutterButton shutterButton = (ShutterButton) this.b;
                xga xgaVar = shutterButton.e;
                if (xgaVar != null) {
                    final q42 q42Var = (q42) xgaVar;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = q42Var.e;
                    x02 x02Var = chatAttachAlertPhotoLayout.b;
                    z42 z42Var = chatAttachAlertPhotoLayout.S;
                    byte b = x02Var.N2;
                    d dVar = x02Var.Z1;
                    if ((b == 2 || (dVar instanceof mu1)) && !chatAttachAlertPhotoLayout.t0 && !x02Var.P1 && chatAttachAlertPhotoLayout.Q != null && !x02Var.A1) {
                        if (dVar == null) {
                            dVar = LaunchActivity.Q();
                        }
                        if (dVar != null && dVar.getParentActivity() != null) {
                            if (!chatAttachAlertPhotoLayout.x0) {
                                yjb.x(null, 2131749363, new u21(chatAttachAlertPhotoLayout.Q, q42Var.c), null);
                            } else if (chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                chatAttachAlertPhotoLayout.R0 = true;
                                dVar.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                            } else {
                                for (int i12 = 0; i12 < 2; i12++) {
                                    chatAttachAlertPhotoLayout.T[i12].animate().alpha(0.0f).translationX(gl.L(30.0f)).setDuration(150L).setInterpolator(s33.f).start();
                                }
                                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.s0.animate().alpha(0.0f).translationX(-gl.L(30.0f)).setDuration(150L);
                                s33 s33Var = s33.f;
                                duration.setInterpolator(s33Var).start();
                                chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                                d dVar2 = x02Var.Z1;
                                if ((dVar2 instanceof mu1) && ((mu1) dVar2).y()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                q42Var.a = gl.s0(z);
                                gl.R3(z42Var, true);
                                z42Var.setText(gl.g0(0, true, false));
                                chatAttachAlertPhotoLayout.h0 = 0;
                                chatAttachAlertPhotoLayout.i0 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        q42 q42Var2 = q42Var;
                                        switch (b2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = q42Var2.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(gl.g0(i13, true, false));
                                                    gl.d3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                gl.d3(q42Var2.e.i0, 1000L);
                                                return;
                                        }
                                    }
                                };
                                gl.d2(dVar.getParentActivity());
                                CameraController cameraController = CameraController.getInstance();
                                Object cameraSessionObject = chatAttachAlertPhotoLayout.Q.getCameraSessionObject();
                                File file = q42Var.a;
                                if (x02Var.N2 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                cameraController.recordVideo(cameraSessionObject, file, z2, new rh1(q42Var, (byte) 15), new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r2;
                                        q42 q42Var2 = q42Var;
                                        switch (b2) {
                                            case 0:
                                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = q42Var2.e;
                                                if (chatAttachAlertPhotoLayout2.i0 != null) {
                                                    int i13 = chatAttachAlertPhotoLayout2.h0 + 1;
                                                    chatAttachAlertPhotoLayout2.h0 = i13;
                                                    chatAttachAlertPhotoLayout2.S.setText(gl.g0(i13, true, false));
                                                    gl.d3(chatAttachAlertPhotoLayout2.i0, 1000L);
                                                    return;
                                                }
                                                return;
                                            default:
                                                gl.d3(q42Var2.e.i0, 1000L);
                                                return;
                                        }
                                    }
                                }, chatAttachAlertPhotoLayout.Q);
                                chatAttachAlertPhotoLayout.l0.a(yga.b);
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
