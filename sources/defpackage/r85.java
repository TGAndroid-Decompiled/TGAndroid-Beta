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
public final class r85 extends LinearLayout implements VoIPService.StateListener, gk7 {
    public boolean E;
    public float F;
    public float G;
    public TextView a;
    public TextView b;
    public dic c;
    public dic d;
    public be0 e;
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
        dic dicVar = this.d;
        dic dicVar2 = this.c;
        if (dicVar2 != null && dicVar != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            if (!isBluetoothOn && sharedInstance.isSpeakerphoneOn()) {
                z2 = true;
            } else {
                z2 = false;
            }
            dicVar2.b(z2, z);
            if (isBluetoothOn) {
                z3 = z;
                dicVar2.c(2131230916, -1, 0, 0.1f, true, k96.M0(2131743261, null), false, z3);
            } else {
                z3 = z;
                if (z2) {
                    dicVar2.c(2131230924, -1, 0, 0.3f, true, k96.M0(2131742997, null), false, z3);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    dicVar2.c(2131230919, -1, 0, 0.1f, true, k96.M0(2131743259, null), false, z3);
                } else {
                    dicVar2.c(2131230924, -1, 0, 0.1f, true, k96.M0(2131742997, null), false, z3);
                }
            }
            if (sharedInstance.mutedByAdmin()) {
                dicVar.c(2131230925, -1, bm2.o(-1, 76), 0.1f, true, k96.M0(2131743049, null), true, z3);
            } else {
                if (sharedInstance.isMicMute()) {
                    f = 0.3f;
                } else {
                    f = 0.15f;
                }
                int o = bm2.o(-1, (int) (f * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i = 2131742988;
                } else {
                    i = 2131743051;
                }
                dicVar.c(2131230925, -1, o, 0.1f, true, k96.M0(i, null), sharedInstance.isMicMute(), z3);
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
                textView.setText(k96.M0(2131743150, "VoipGroupConnecting"));
                return;
            }
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.b;
            if (groupCall.rtmp_stream) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            textView.setText(k96.G(groupCall.participants_count, str, new Object[0]));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean mutedByAdmin;
        if (i == kk7.v2) {
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
        fc2 fc2Var;
        int i = this.y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            pb0 pb0Var = new pb0((wjb) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            int[] iArr = bkb.o8;
            long j2 = 0;
            if (chat != null) {
                j = chat.id;
            } else {
                j = 0;
            }
            int w0 = bkb.w0(null, iArr[pb0.d(j)], false);
            int[] iArr2 = bkb.p8;
            if (chat != null) {
                j2 = chat.id;
            }
            pb0Var.h(w0, bkb.w0(null, iArr2[pb0.d(j2)], false));
            pb0Var.p(chat);
            if (chat != null) {
                this.e.m(gl5.e(chat.photo.photo_small), "50_50", pb0Var, null);
            }
            if (sharedInstance.isConference() && (fc2Var = sharedInstance.groupCall) != null) {
                if (fc2Var.e.size() == 1) {
                    str = k96.M0(2131751811, null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(cf3.s(cf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(k96.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
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
        kk7.f(i).b(this, kk7.v2);
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
        kk7.f(this.y).n(this, kk7.v2);
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
            int f7 = bm2.f(1.0f - this.F, bkb.w0(null, bkb.Sh, false), bkb.w0(null, bkb.Uh, false));
            int f8 = bm2.f(1.0f - this.F, bkb.w0(null, bkb.Th, false), bkb.w0(null, bkb.Vh, false));
            int f9 = bm2.f(this.G, f7, bkb.w0(null, bkb.Wh, false));
            int f10 = bm2.f(this.G, f8, bkb.w0(null, bkb.Xh, false));
            this.x = false;
            byte b = this.r;
            if (b == 0) {
                this.n = new LinearGradient(-gl.L(60.0f), this.w - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{f9, f10}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (b == 1) {
                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, gl.L(60.0f) + getMeasuredWidth(), this.w - getTranslationY(), new int[]{f10, f9}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (b == 2) {
                this.n = new LinearGradient(this.s - getTranslationX(), -gl.L(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{f9, f10}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), gl.L(60.0f) + getMeasuredHeight(), new int[]{f10, f9}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
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
            canvas.clipRect(translationX - gl.L(15.0f), measuredHeight - gl.L(15.0f), translationX, gl.L(15.0f) + measuredHeight);
            canvas.translate(gl.L(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (b3 == 1) {
            canvas.clipRect(translationX, measuredHeight - gl.L(15.0f), gl.L(15.0f) + translationX, gl.L(15.0f) + measuredHeight);
            canvas.translate(-gl.L(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (b3 == 2) {
            canvas.clipRect(translationX - gl.L(15.0f), measuredHeight - gl.L(15.0f), gl.L(15.0f) + translationX, measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, gl.L(3.0f));
        } else {
            canvas.clipRect(translationX - gl.L(15.0f), measuredHeight, gl.L(15.0f) + translationX, gl.L(15.0f) + measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, -gl.L(3.0f));
        }
        rectF.set(translationX - gl.L(10.0f), measuredHeight - gl.L(10.0f), translationX + gl.L(10.0f), measuredHeight + gl.L(10.0f));
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(230.0f), 1073741824), i2);
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
