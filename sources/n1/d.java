package n1;

import ad.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.v;
import g.y;
import java.io.EOFException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.UUID;
import k1.z;
import ma.j;
import n5.k;
import oa.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.z10;
import org.telegram.ui.ni0;
import org.telegram.ui.ou0;
import pf.i1;
import pf.u0;
import r5.i;
import r5.t;
import rh.b2;
import rh.d1;
import rh.e4;
import rh.g0;
import rh.g4;
import rh.l3;
import rh.p3;
import rh.x;
import rh.x1;
import yf.b1;
import yf.y0;
import yf.z0;
import zf.n2;
import zf.v1;

public final class d implements k1.f, m4.h, OnCompleteListener, m, j1, jg.g, vd.a, p5.a, i1, s, ln0, x4, g0, y2.b, v1 {

    public final int f18087a;

    public final Object f18088b;

    public d(ga.c cVar) {
        this.f18087a = 1;
        this.f18088b = (r) cVar.f6834b;
    }

    @Override
    public void A(y yVar) {
        switch (this.f18087a) {
            case 9:
                yVar.a(((gi) this.f18088b).getThemedColor(g6.f23053d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
            default:
                yVar.a(((sp0) this.f18088b).getThemedColor(g6.f23053d6));
                yVar.b(SharedConfig.chatBlurEnabled());
                break;
        }
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean B() {
        return true;
    }

    public void C() {
        z0 z0Var = ((b1) this.f18088b).d;
        if (z0Var != null) {
            y0 y0Var = z0Var.f50137s;
            if (y0Var != null) {
                z0Var.cancelRunnable(y0Var);
                z0Var.f50137s = null;
            }
            y0 y0Var2 = new y0(z0Var, 1);
            z0Var.f50137s = y0Var2;
            z0Var.postRunnable(y0Var2, 1L);
        }
    }

    @Override
    public boolean D0(int i10) {
        return true;
    }

    @Override
    public long E() {
        return 0L;
    }

    @Override
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public long F(long j10) {
        return 1L;
    }

    @Override
    public CharacterStyle F1(s1 s1Var) {
        return null;
    }

    @Override
    public long G(long j10, long j11) {
        return 1L;
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ba baVar = (ba) this.f18088b;
        org.telegram.ui.Cells.g gVar = baVar.v;
        if (baVar.a()) {
            baVar.f24136s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean H1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        x1 x1Var = (x1) this.f18088b;
        x1Var.s0(i10, i11, z10);
        ni0 ni0Var = x1Var.K0;
        if (ni0Var != null) {
            ni0Var.i();
            x1Var.K0 = null;
        }
    }

    @Override
    public void I0() {
        g4 g4Var = (g4) this.f18088b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            rh.a aVar = g4Var.f47594a;
            p3 p3Var = ((l3) e4Var).f47259a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.f47340d3.onContentChanged();
        }
    }

    @Override
    public a0.h J() {
        return null;
    }

    public int K(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int iC;
        int i11;
        ob.a aVar = (ob.a) this.f18088b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i12 = 1;
            while (i12 < length && iArr[i12] == 0) {
                i12++;
            }
            if (i12 == length) {
                iArr2 = new int[]{0};
            } else {
                int i13 = length - i12;
                int[] iArr4 = new int[i13];
                System.arraycopy(iArr, i12, iArr4, 0, i13);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = aVar.f19415a[aVar.f19420g + i14];
            if (i15 == 0) {
                i11 = iArr2[iArr2.length - 1];
            } else {
                if (i15 == 1) {
                    iC = 0;
                    for (int i16 : iArr2) {
                        ob.a aVar2 = ob.a.h;
                        iC ^= i16;
                    }
                } else {
                    iC = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i17 = 1; i17 < length2; i17++) {
                        iC = aVar.c(i15, iC) ^ iArr2[i17];
                    }
                }
                i11 = iC;
            }
            iArr5[(i10 - 1) - i14] = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        ob.b bVar = new ob.b(aVar, iArr5);
        ob.b bVarA = aVar.a(i10, 1);
        ob.b bVar2 = aVar.f19417c;
        if (bVarA.d() >= bVar.d()) {
            bVarA = bVar;
            bVar = bVarA;
        }
        ob.b bVar3 = aVar.d;
        ob.b bVar4 = bVarA;
        ob.b bVarA2 = bVar;
        ob.b bVar5 = bVar4;
        ob.b bVar6 = bVar2;
        while (bVar5.d() * 2 >= i10) {
            if (bVar5.e()) {
                throw new ob.c("r_{i-1} was zero");
            }
            int iB = aVar.b(bVar5.c(bVar5.d()));
            ob.b bVarA3 = bVar2;
            while (bVarA2.d() >= bVar5.d() && !bVarA2.e()) {
                int iD = bVarA2.d() - bVar5.d();
                int iC2 = aVar.c(bVarA2.c(bVarA2.d()), iB);
                bVarA3 = bVarA3.a(aVar.a(iD, iC2));
                bVarA2 = bVarA2.a(bVar5.h(iD, iC2));
            }
            ob.b bVarA4 = bVarA3.g(bVar3).a(bVar6);
            if (bVarA2.d() >= bVar5.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVarA2 + ", rLast: " + bVar5);
            }
            ob.b bVar7 = bVarA2;
            bVarA2 = bVar5;
            bVar5 = bVar7;
            bVar6 = bVar3;
            bVar3 = bVarA4;
        }
        int iC3 = bVar3.c(0);
        if (iC3 == 0) {
            throw new ob.c("sigmaTilde(0) was zero");
        }
        int iB2 = aVar.b(iC3);
        ob.b[] bVarArr = {bVar3.f(iB2), bVar5.f(iB2)};
        ob.b bVar8 = bVarArr[0];
        ob.b bVar9 = bVarArr[1];
        int iD2 = bVar8.d();
        if (iD2 == 1) {
            iArr3 = new int[]{bVar8.c(1)};
        } else {
            int[] iArr6 = new int[iD2];
            int i18 = 0;
            for (int i19 = 1; i19 < aVar.f19418e && i18 < iD2; i19++) {
                if (bVar8.b(i19) == 0) {
                    iArr6[i18] = aVar.b(i19);
                    i18++;
                }
            }
            if (i18 != iD2) {
                throw new ob.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i20 = 0; i20 < length3; i20++) {
            int iB3 = aVar.b(iArr3[i20]);
            int iC4 = 1;
            for (int i21 = 0; i21 < length3; i21++) {
                if (i20 != i21) {
                    int iC5 = aVar.c(iArr3[i21], iB3);
                    iC4 = aVar.c(iC4, (iC5 & 1) == 0 ? iC5 | 1 : iC5 & (-2));
                }
            }
            int iC6 = aVar.c(bVar9.b(iB3), aVar.b(iC4));
            iArr7[i20] = iC6;
            if (aVar.f19420g != 0) {
                iArr7[i20] = aVar.c(iC6, iB3);
            }
        }
        for (int i22 = 0; i22 < iArr3.length; i22++) {
            int length4 = iArr.length - 1;
            int i23 = iArr3[i22];
            if (i23 == 0) {
                throw new IllegalArgumentException();
            }
            int i24 = length4 - aVar.f19416b[i23];
            if (i24 < 0) {
                throw new ob.c("Bad error location");
            }
            iArr[i24] = iArr[i24] ^ iArr7[i22];
        }
        return iArr3.length;
    }

    @Override
    public boolean L0(long j10) {
        return false;
    }

    @Override
    public boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public j9 N() {
        e4 e4Var = ((g4) this.f18088b).C;
        if (e4Var != null) {
            return ((l3) e4Var).f47259a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void O0(int i10, s1 s1Var) {
        ba baVar = (ba) this.f18088b;
        org.telegram.ui.Cells.g gVar = baVar.v;
        if (baVar.a()) {
            baVar.f24136s = 2;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public ou0 O1() {
        return null;
    }

    public boolean P(MotionEvent motionEvent) {
        boolean zOnDoubleTap;
        MotionEvent motionEvent2;
        boolean zOnFling;
        z10 z10Var;
        boolean zOnScroll;
        y10 y10Var = (y10) this.f18088b;
        int i10 = y10.f34758w;
        z10 z10Var2 = y10Var.f34763f;
        androidx.mediarouter.app.c cVar = y10Var.f34762e;
        int action = motionEvent.getAction();
        if (y10Var.v == null) {
            y10Var.v = VelocityTracker.obtain();
        }
        y10Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z10 = i11 == 6;
        int actionIndex = z10 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x8 = 0.0f;
        float y10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                x8 = motionEvent.getX(i12) + x8;
                y10 = motionEvent.getY(i12) + y10;
            }
        }
        float f10 = z10 ? pointerCount - 1 : pointerCount;
        float f11 = x8 / f10;
        float f12 = y10 / f10;
        if (i11 == 0) {
            if (y10Var.f34764g == null || !z10Var2.a()) {
                zOnDoubleTap = false;
            } else {
                boolean zHasMessages = cVar.hasMessages(3);
                if (zHasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent3 = y10Var.f34769m;
                if (motionEvent3 != null && (motionEvent2 = y10Var.f34770n) != null && zHasMessages && y10Var.f34768l && motionEvent.getEventTime() - motionEvent2.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                    int y11 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                    if ((y11 * y11) + (x10 * x10) < y10Var.f34760b) {
                        y10Var.f34771o = true;
                        zOnDoubleTap = y10Var.f34764g.onDoubleTap(y10Var.f34769m) | y10Var.f34764g.onDoubleTapEvent(motionEvent);
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
                zOnDoubleTap = false;
            }
            y10Var.f34772p = f11;
            y10Var.f34774r = f11;
            y10Var.f34773q = f12;
            y10Var.f34775s = f12;
            MotionEvent motionEvent4 = y10Var.f34769m;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            y10Var.f34769m = MotionEvent.obtain(motionEvent);
            y10Var.f34767k = true;
            y10Var.f34768l = true;
            y10Var.h = true;
            y10Var.f34766j = false;
            y10Var.f34765i = false;
            if (y10Var.f34776t) {
                cVar.removeMessages(2);
                cVar.sendEmptyMessageAtTime(2, y10Var.f34769m.getDownTime() + ((long) i10) + y10Var.f34777u);
            }
            cVar.sendEmptyMessageAtTime(1, y10Var.f34769m.getDownTime() + ((long) i10));
            return z10Var2.onDown(motionEvent) | zOnDoubleTap;
        }
        if (i11 == 1) {
            y10Var.h = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (y10Var.f34771o) {
                zOnFling = y10Var.f34764g.onDoubleTapEvent(motionEvent);
            } else {
                if (y10Var.f34766j) {
                    cVar.removeMessages(3);
                    y10Var.f34766j = false;
                } else if (y10Var.f34767k) {
                    boolean zOnSingleTapUp = z10Var2.onSingleTapUp(motionEvent);
                    if (y10Var.f34765i && (z10Var = y10Var.f34764g) != null) {
                        z10Var.onSingleTapConfirmed(motionEvent);
                    }
                    zOnFling = zOnSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = y10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, y10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > y10Var.f34761c || Math.abs(xVelocity) > y10Var.f34761c) {
                        zOnFling = z10Var2.onFling(y10Var.f34769m, motionEvent, xVelocity, yVelocity);
                    }
                }
                zOnFling = false;
            }
            MotionEvent motionEvent5 = y10Var.f34770n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            y10Var.f34770n = motionEventObtain;
            VelocityTracker velocityTracker2 = y10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                y10Var.v = null;
            }
            y10Var.f34771o = false;
            y10Var.f34765i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return zOnFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                y10Var.v.recycle();
                y10Var.v = null;
                y10Var.f34771o = false;
                y10Var.h = false;
                y10Var.f34767k = false;
                y10Var.f34768l = false;
                y10Var.f34765i = false;
                if (y10Var.f34766j) {
                    y10Var.f34766j = false;
                    return false;
                }
            } else if (i11 == 5) {
                y10Var.f34772p = f11;
                y10Var.f34774r = f11;
                y10Var.f34773q = f12;
                y10Var.f34775s = f12;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                y10Var.f34771o = false;
                y10Var.f34767k = false;
                y10Var.f34768l = false;
                y10Var.f34765i = false;
                if (y10Var.f34766j) {
                    y10Var.f34766j = false;
                    return false;
                }
            } else if (i11 == 6) {
                y10Var.f34772p = f11;
                y10Var.f34774r = f11;
                y10Var.f34773q = f12;
                y10Var.f34775s = f12;
                y10Var.v.computeCurrentVelocity(1000, y10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = y10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = y10Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((y10Var.v.getYVelocity(pointerId3) * yVelocity2) + (y10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            y10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!y10Var.f34766j) {
            float f13 = y10Var.f34772p - f11;
            float f14 = y10Var.f34773q - f12;
            if (y10Var.f34771o) {
                return y10Var.f34764g.onDoubleTapEvent(motionEvent);
            }
            if (y10Var.f34767k) {
                int i14 = (int) (f11 - y10Var.f34774r);
                int i15 = (int) (f12 - y10Var.f34775s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > y10Var.f34759a) {
                    zOnScroll = z10Var2.onScroll(y10Var.f34769m, motionEvent, f13, f14);
                    y10Var.f34772p = f11;
                    y10Var.f34773q = f12;
                    y10Var.f34767k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    zOnScroll = false;
                }
                if (i16 > y10Var.f34759a) {
                    y10Var.f34768l = false;
                }
                return zOnScroll;
            }
            if (Math.abs(f13) >= 1.0f || Math.abs(f14) >= 1.0f) {
                boolean zOnScroll2 = z10Var2.onScroll(y10Var.f34769m, motionEvent, f13, f14);
                y10Var.f34772p = f11;
                y10Var.f34773q = f12;
                return zOnScroll2;
            }
        }
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        ba baVar = (ba) this.f18088b;
        org.telegram.ui.Cells.g gVar = baVar.v;
        if (baVar.a()) {
            baVar.f24136s = 0;
            s1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void S(CharSequence charSequence) {
        e4 e4Var = ((g4) this.f18088b).C;
        if (e4Var != null) {
            l3 l3Var = (l3) e4Var;
            l3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            l3Var.f47259a.t4(charSequence.toString());
        }
    }

    @Override
    public boolean S0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public void V0(ArrayList arrayList) {
        u0 u0Var = (u0) this.f18088b;
        String str = u0Var.V;
        if (str != null) {
            u0Var.U(str, u0Var.Y, u0Var.Z, u0Var.X, u0Var.W);
        }
    }

    @Override
    public boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean W(s1 s1Var) {
        return false;
    }

    @Override
    public boolean X() {
        return false;
    }

    @Override
    public void X0() {
        g4 g4Var = (g4) this.f18088b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            rh.a aVar = g4Var.f47594a;
            p3.O1(((l3) e4Var).f47259a);
        }
    }

    @Override
    public boolean Y0(int i10, s1 s1Var) {
        return i10 == ((ba) this.f18088b).f24136s;
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    public byte a0() {
        int i10 = ((com.google.firebase.messaging.d) this.f18088b).read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        return rl.a(messageObject);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f18087a;
        Object obj3 = this.f18088b;
        switch (i10) {
            case 16:
                r5.r rVar = new r5.r(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((t) obj).u();
                Parcel parcelM0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(parcelM0, rVar);
                parcelM0.writeStringArray((String[]) obj3);
                iVar.R0(parcelM0, 7);
                break;
            case 20:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.d dVar = (s6.d) ((s6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = b7.b.f2036a;
                parcelObtain.writeStrongBinder(fVar);
                b7.b.b(parcelObtain, (r6.f) obj3);
                b7.b.b(parcelObtain, gVar);
                ((s6.b) dVar).E0(parcelObtain, 6);
                break;
            default:
                t6.a aVar = new t6.a((TaskCompletionSource) obj2);
                t6.i iVar2 = (t6.i) ((t6.c) obj).u();
                String str = ((t6.b) obj3).f48102k;
                Parcel parcelI0 = iVar2.I0();
                int i12 = t6.f.f48106a;
                parcelI0.writeStrongBinder(aVar);
                parcelI0.writeString(str);
                iVar2.J0(parcelI0, 2);
                break;
        }
    }

    @Override
    public void b(float f10) {
        x xVar = (x) this.f18088b;
        MessageObject messageObject = xVar.L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(xVar.L, f10);
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public Object c(p pVar, tc.c cVar) {
        return ((z) this.f18088b).c(new c(pVar, null, 0), cVar);
    }

    @Override
    public void c0(float f10) {
        ((n2) this.f18088b).setOutlineWidth(f10);
    }

    @Override
    public boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean d() {
        return ((ba) this.f18088b).a();
    }

    @Override
    public qg.a d0() {
        return null;
    }

    @Override
    public void e(float f10) {
        MessageObject messageObject = ((x) this.f18088b).L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override
    public boolean e0(s1 s1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public Object f2() {
        Type type = (Type) this.f18088b;
        if (!(type instanceof ParameterizedType)) {
            throw new j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new j("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g(d1 d1Var) {
        e4 e4Var = ((g4) this.f18088b).C;
        if (e4Var != null) {
            p3 p3Var = ((l3) e4Var).f47259a;
            p3.M1(p3Var, d1Var);
            p3Var.f47340d3.n0(d1Var, true);
        }
    }

    public int g0() {
        return ((a0() & 255) << 24) | ((a0() & 255) << 16) | ((a0() & 255) << 8) | (a0() & 255);
    }

    @Override
    public Object mo28get() {
        return new u2.b((Context) ((e.a) this.f18088b).f5035a, new w9.d(6), new v(6), 8);
    }

    @Override
    public ld.b getData() {
        return ((z) this.f18088b).f14333c;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public String h(s1 s1Var) {
        return null;
    }

    @Override
    public a0.h h0() {
        return null;
    }

    @Override
    public void i(int i10) {
        ((u0) this.f18088b).l();
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public boolean k2(int i10) {
        return false;
    }

    @Override
    public int l0(s1 s1Var) {
        return 0;
    }

    @Override
    public void m() {
        g4 g4Var = (g4) this.f18088b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            p3.P1(((l3) e4Var).f47259a, g4Var.f47594a);
        }
    }

    @Override
    public void n(Canvas canvas) {
        switch (this.f18087a) {
            case 9:
                gi giVar = (gi) this.f18088b;
                canvas.drawColor(giVar.getThemedColor(g6.f23053d6));
                if (SharedConfig.chatBlurEnabled()) {
                    giVar.f28713y2.b(canvas, -2);
                }
                break;
            default:
                sp0 sp0Var = (sp0) this.f18088b;
                canvas.drawColor(sp0Var.getThemedColor(g6.f23053d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sp0Var.K0.b(canvas, -2);
                }
                break;
        }
    }

    public int n0() {
        return ((a0() & 127) << 21) | ((a0() & 127) << 14) | ((a0() & 127) << 7) | (a0() & 127);
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        int iDp = AndroidUtilities.dp(9.0f);
        n51 n51Var = (n51) this.f18088b;
        float f12 = -iDp;
        n51Var.f30871g.inset(f12, f12);
        boolean zContains = n51Var.f30871g.contains(f10, f11);
        float f13 = iDp;
        n51Var.f30871g.inset(f13, f13);
        return zContains;
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        return false;
    }

    public void o0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long jSkip = ((com.google.firebase.messaging.d) this.f18088b).skip(j10 - j11);
            if (jSkip <= 0) {
                throw new EOFException();
            }
            j11 += jSkip;
        }
    }

    @Override
    public k9 o2() {
        return null;
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((n51) this.f18088b).f30873j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        ((n51) this.f18088b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        ((n51) this.f18088b).h.c(false);
    }

    @Override
    public void onComplete(Task task) {
        n5.c.h((n5.c) ((k) this.f18088b).f18323c, "joinApplication", task);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public boolean p0() {
        return d();
    }

    @Override
    public i9 q0() {
        return (g4) this.f18088b;
    }

    @Override
    public long r(long j10, long j11) {
        return 0L;
    }

    @Override
    public long s(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public boolean s0(t5 t5Var) {
        return false;
    }

    @Override
    public boolean s1() {
        return false;
    }

    @Override
    public rh.a u0() {
        return ((g4) this.f18088b).f47594a;
    }

    @Override
    public n4.j w(long j10) {
        return (n4.j) this.f18088b;
    }

    @Override
    public boolean w0() {
        g4 g4Var = (g4) this.f18088b;
        e4 e4Var = g4Var.C;
        if (e4Var == null) {
            return false;
        }
        rh.a aVar = g4Var.f47594a;
        return ((l3) e4Var).f47259a.S4();
    }

    @Override
    public boolean x1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public long y(long j10, long j11) {
        return 0L;
    }

    @Override
    public void y0(int i10, int i11) {
        g4 g4Var = (g4) this.f18088b;
        e4 e4Var = g4Var.C;
        if (e4Var != null) {
            rh.a aVar = g4Var.f47594a;
            b2 b2Var = ((l3) e4Var).f47259a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override
    public String z(long j10) {
        return null;
    }

    @Override
    public void z0(Bitmap bitmap) {
        ((p5.h) this.f18088b).e(bitmap, 3);
    }

    @Override
    public boolean z1() {
        return false;
    }

    public d(Object obj, int i10) {
        this.f18087a = i10;
        this.f18088b = obj;
    }

    public d(r5.s sVar, String[] strArr) {
        this.f18087a = 16;
        this.f18088b = strArr;
    }

    public d() {
        this.f18087a = 5;
        this.f18088b = new SparseArray();
    }

    public d(UUID uuid, int i10, byte[] bArr) {
        this.f18087a = 22;
        this.f18088b = uuid;
    }

    public d(Context context, z10 z10Var) {
        this.f18087a = 10;
        this.f18088b = new y10(context, z10Var);
    }

    @Override
    public float get() {
        return ((n2) this.f18088b).B;
    }

    public d(int i10, int i11) {
        this.f18087a = 11;
        this.f18088b = ApplicationLoader.applicationContext.getSharedPreferences(a9.p.j(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void C0() {
    }

    @Override
    public void I1() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void u() {
    }

    @Override
    public void B0(s1 s1Var) {
    }

    @Override
    public void B1(s1 s1Var) {
    }

    @Override
    public void D(s1 s1Var) {
    }

    @Override
    public void D1(MessageObject messageObject) {
    }

    @Override
    public void G0(s1 s1Var) {
    }

    @Override
    public void H(s1 s1Var) {
    }

    @Override
    public void H0(s1 s1Var) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void M(s1 s1Var) {
    }

    @Override
    public void M0(s1 s1Var) {
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void Q(s1 s1Var) {
    }

    @Override
    public void T(MessageObject messageObject) {
    }

    @Override
    public void U0(s1 s1Var) {
    }

    @Override
    public void W0(s1 s1Var) {
    }

    @Override
    public void Z(s1 s1Var) {
    }

    @Override
    public void Z1(s1 s1Var) {
    }

    @Override
    public void d2(s1 s1Var) {
    }

    @Override
    public void i0(int i10) {
    }

    @Override
    public void m0(s1 s1Var) {
    }

    @Override
    public void p(s1 s1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void t(s1 s1Var) {
    }

    @Override
    public void u1(s1 s1Var) {
    }

    @Override
    public void v(s1 s1Var) {
    }

    @Override
    public void x(s1 s1Var) {
    }

    @Override
    public void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void R(int i10, s1 s1Var) {
    }

    @Override
    public void a2(s1 s1Var, fh.f fVar) {
    }

    @Override
    public void b2(s1 s1Var, long j10) {
    }

    @Override
    public void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void h1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public long l(long j10, long j11) {
        return j11;
    }

    @Override
    public void v1(s1 s1Var, boolean z10) {
    }

    @Override
    public void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void k0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void m1(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void n2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override
    public void t0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void x0(s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
