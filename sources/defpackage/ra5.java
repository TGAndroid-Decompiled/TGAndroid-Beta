package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class ra5 extends LinearLayout implements VoIPService.StateListener, jm7 {
    public boolean E;
    public float F;
    public float G;
    public TextView a;
    public TextView b;
    public dkc c;
    public dkc d;
    public bf0 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public byte r;
    public float s;
    public float w;
    public boolean x;
    public int y;

    public final void a(float f, float f2, int i) {
        this.r = i;
        this.s = f;
        this.w = f2;
        invalidate();
        this.x = true;
    }

    public final void b(boolean z) {
        VoIPService sharedInstance;
        boolean z2;
        boolean z3;
        float f;
        int i;
        dkc dkcVar = this.d;
        dkc dkcVar2 = this.c;
        if (dkcVar2 != null && dkcVar != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z2 = true;
            } else {
                z2 = false;
            }
            dkcVar2.b(z2, z);
            if (isBluetoothOn) {
                z3 = z;
                dkcVar2.c(2131230917, -1, 0, 0.1f, true, jb6.M0(2131743187, null), false, z3);
            } else {
                z3 = z;
                if (z2) {
                    dkcVar2.c(2131230925, -1, 0, 0.3f, true, jb6.M0(2131742923, null), false, z3);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    dkcVar2.c(2131230920, -1, 0, 0.1f, true, jb6.M0(2131743185, null), false, z3);
                } else {
                    dkcVar2.c(2131230925, -1, 0, 0.1f, true, jb6.M0(2131742923, null), false, z3);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                dkcVar.c(2131230926, -1, on2.p(-1, 76), 0.1f, true, jb6.M0(2131742975, null), true, z3);
            } else {
                if (sharedInstance.isMicMute()) {
                    f = 0.3f;
                } else {
                    f = 0.15f;
                }
                int p = on2.p(-1, (int) (f * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i = 2131742914;
                } else {
                    i = 2131742977;
                }
                dkcVar.c(2131230926, -1, p, 0.1f, true, jb6.M0(i, null), sharedInstance.isMicMute(), z3);
            }
            invalidate();
        }
    }

    public final void c() {
        String str;
        TextView textView = this.b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                textView.setText(jb6.M0(2131743076, "VoipGroupConnecting"));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.b;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(jb6.G(groupCall.participants_count, str, new Object[0]));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean mutedByAdmin;
        if (i == nm7.w2) {
            c();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.E) {
                this.E = mutedByAdmin;
                invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        long j;
        String str;
        float f;
        qd2 qd2Var;
        int i = this.y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            pc0 pc0Var = new pc0((ylb) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = cmb.o8;
            long j2 = 0;
            if (chat != null) {
                j = chat.id;
            } else {
                j = 0;
            }
            int w0 = cmb.w0(null, iArr[pc0.d(j)], false);
            int[] iArr2 = cmb.p8;
            if (chat != null) {
                j2 = chat.id;
            }
            pc0Var.h(w0, cmb.w0(null, iArr2[pc0.d(j2)], false));
            pc0Var.p(chat);
            if (chat != null) {
                this.e.m(gn5.e(chat.photo.photo_small), "50_50", pc0Var, null);
            }
            if (sharedInstance.isConference() && (qd2Var = sharedInstance.groupCall) != null) {
                if (qd2Var.e.size() == 1) {
                    str = jb6.M0(2131751760, null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(pg3.s(pg3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(jb6.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    str = sb.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                str = sharedInstance.groupCall.b.title;
            } else if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.E = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f2 = 0.0f;
            if (this.E) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.G = f;
            this.F = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.E) ? 1.0f : 1.0f;
        }
        nm7.f(i).b(this, nm7.w2);
        b(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        nm7.f(this.y).n(this, nm7.w2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        float translationX;
        float measuredHeight;
        Paint paint = this.h;
        RectF rectF = this.f;
        if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute() && !this.E) {
            z = false;
        } else {
            z = true;
        }
        float f = this.F;
        if (z) {
            if (f != 1.0f) {
                float f2 = f + 0.10666667f;
                this.F = f2;
                if (f2 >= 1.0f) {
                    this.F = 1.0f;
                }
                this.x = true;
                invalidate();
            }
        } else if (f != 0.0f) {
            float f3 = f - 0.10666667f;
            this.F = f3;
            if (f3 < 0.0f) {
                this.F = 0.0f;
            }
            this.x = true;
            invalidate();
        }
        boolean z2 = this.E;
        float f4 = this.G;
        if (z2) {
            if (f4 != 1.0f) {
                float f5 = f4 + 0.10666667f;
                this.G = f5;
                if (f5 >= 1.0f) {
                    this.G = 1.0f;
                }
                this.x = true;
                invalidate();
            }
        } else if (f4 != 0.0f) {
            float f6 = f4 - 0.10666667f;
            this.G = f6;
            if (f6 < 0.0f) {
                this.G = 0.0f;
            }
            this.x = true;
            invalidate();
        }
        if (this.x) {
            int f7 = on2.f(1.0f - this.F, cmb.w0(null, cmb.Sh, false), cmb.w0(null, cmb.Uh, false));
            int f8 = on2.f(1.0f - this.F, cmb.w0(null, cmb.Th, false), cmb.w0(null, cmb.Vh, false));
            int f9 = on2.f(this.G, f7, cmb.w0(null, cmb.Wh, false));
            int f10 = on2.f(this.G, f8, cmb.w0(null, cmb.Xh, false));
            this.x = false;
            byte b = this.r;
            if (b == 0) {
                this.n = new LinearGradient(-gm.L(60.0f), this.w - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{f9, f10}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (b == 1) {
                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, gm.L(60.0f) + getMeasuredWidth(), this.w - getTranslationY(), new int[]{f10, f9}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (b == 2) {
                this.n = new LinearGradient(this.s - getTranslationX(), -gm.L(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{f9, f10}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), gm.L(60.0f) + getMeasuredHeight(), new int[]{f10, f9}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
        byte b2 = this.r;
        if (b2 == 0) {
            measuredHeight = this.w - getTranslationY();
            translationX = 0.0f;
        } else if (b2 == 1) {
            measuredHeight = this.w - getTranslationY();
            translationX = getMeasuredWidth();
        } else {
            float f11 = this.s;
            if (b2 == 2) {
                translationX = f11 - getTranslationX();
                measuredHeight = 0.0f;
            } else {
                translationX = f11 - getTranslationX();
                measuredHeight = getMeasuredHeight();
            }
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        byte b3 = this.r;
        if (b3 == 0) {
            canvas.clipRect(translationX - gm.L(15.0f), measuredHeight - gm.L(15.0f), translationX, gm.L(15.0f) + measuredHeight);
            canvas.translate(gm.L(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (b3 == 1) {
            canvas.clipRect(translationX, measuredHeight - gm.L(15.0f), gm.L(15.0f) + translationX, gm.L(15.0f) + measuredHeight);
            canvas.translate(-gm.L(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (b3 == 2) {
            canvas.clipRect(translationX - gm.L(15.0f), measuredHeight - gm.L(15.0f), gm.L(15.0f) + translationX, measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, gm.L(3.0f));
        } else {
            canvas.clipRect(translationX - gm.L(15.0f), measuredHeight, gm.L(15.0f) + translationX, gm.L(15.0f) + measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, -gm.L(3.0f));
        }
        rectF.set(translationX - gm.L(10.0f), measuredHeight - gm.L(10.0f), translationX + gm.L(10.0f), measuredHeight + gm.L(10.0f));
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(230.0f), 1073741824), i2);
    }

    @Override
    public final void onStateChanged(int i) {
        c();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onCameraSwitch(boolean z) {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
