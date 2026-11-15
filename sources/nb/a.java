package nb;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b3.q;
import b7.e;
import c4.k;
import c4.m;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import d3.i0;
import e2.u;
import e2.x1;
import e4.h;
import hi.l0;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ji.j;
import lf.b;
import org.telegram.messenger.a8;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.l10;
import org.telegram.messenger.o2;
import org.telegram.messenger.r2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.dr0;
import u4.c;
import u9.d;
import yi.g;
public class a implements s0, e, k, i0, eg.a, l5.e, fg.a, ja.a, b, Continuation, d, q, g, gh.a, l1, OnFailureListener, c {
    public static final a f21103b = new a(14);
    public static a f21104c;
    public final int f21105a;

    public a(int i7) {
        this.f21105a = i7;
    }

    public static String P3(ad.c cVar) {
        String str = cVar.f1033a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    @Override
    public void A0() {
        int i7 = this.f21105a;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public int A2() {
        return 0;
    }

    @Override
    public void B(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void B0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i7 = this.f21105a;
    }

    @Override
    public void B1(q1 q1Var, boolean z10, boolean z11) {
        int i7 = this.f21105a;
    }

    @Override
    public void C0(q1 q1Var, float f10, float f11) {
        int i7 = this.f21105a;
    }

    @Override
    public void C1(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void D0(String str) {
        if (r2.f26206a) {
            a8.b("AudioRecorderV2 " + str);
        }
    }

    @Override
    public int D1() {
        return 0;
    }

    public Signature[] E3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void F(String str, Throwable th2) {
        a8.e("AudioRecorderV2 " + str, th2);
    }

    @Override
    public void F0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void F1(q1 q1Var, boolean z10) {
        int i7 = this.f21105a;
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void H(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void H0(q1 q1Var, boolean z10, boolean z11) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean H1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f21105a;
    }

    @Override
    public void J(dj djVar) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean J1() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f21105a;
    }

    @Override
    public void K1(q1 q1Var, int i7) {
        int i10 = this.f21105a;
    }

    @Override
    public boolean L(u uVar) {
        String str = uVar.f10451s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean L0(long j3) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L1(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7 * 2;
    }

    @Override
    public void N(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void N0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public int O(u uVar) {
        String str = uVar.f10451s;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(r.b.k("Unsupported MIME type: ", str));
    }

    @Override
    public void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f21105a;
    }

    @Override
    public void O1(gj gjVar) {
        int i7 = this.f21105a;
    }

    @Override
    public void P(gj gjVar) {
        int i7 = this.f21105a;
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            shortBuffer2.put(s5);
            shortBuffer2.put(s5);
        }
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f21105a) {
            case 19:
            default:
                vf.c.t(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean R() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle R1(q1 q1Var) {
        switch (this.f21105a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean S(q1 q1Var) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.f21105a;
    }

    @Override
    public boolean T() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean T1(q1 q1Var, gj gjVar) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f21105a;
    }

    @Override
    public int U0() {
        return 0;
    }

    @Override
    public void U1() {
        int i7 = this.f21105a;
    }

    @Override
    public void V(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean V0(q1 q1Var, boolean z10) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public b7.d W(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        dVar.f2948a = cVar.D(context, str);
        int i7 = 1;
        int q10 = cVar.q(context, str, true);
        dVar.f2949b = q10;
        int i10 = dVar.f2948a;
        if (i10 == 0) {
            i10 = 0;
            if (q10 == 0) {
                i7 = 0;
                dVar.f2950c = i7;
                return dVar;
            }
        }
        if (q10 < i10) {
            i7 = -1;
        }
        dVar.f2950c = i7;
        return dVar;
    }

    @Override
    public void W0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public int X() {
        switch (this.f21105a) {
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void X0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f21105a;
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f21105a;
    }

    @Override
    public jh.a Z() {
        switch (this.f21105a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public lf.a a(wf.b bVar) {
        return new gf.k(bVar);
    }

    @Override
    public boolean a0(q1 q1Var) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a2(q1 q1Var, l10 l10Var) {
        int i7 = this.f21105a;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public boolean c() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c0(q1 q1Var, TLRPC.User user) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public dr0 c2() {
        switch (this.f21105a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public p0 d(Class cls) {
        return new m0(true);
    }

    @Override
    public p0 e(Class cls, y1.b bVar) {
        return d(cls);
    }

    @Override
    public void e0(int i7) {
        int i10 = this.f21105a;
    }

    @Override
    public void e2(String str, String str2) {
        int i7 = this.f21105a;
    }

    @Override
    public m f(u uVar) {
        String str = uVar.f10451s;
        List list = uVar.v;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new h(list);
                case 1:
                    return new xi.e(2);
                case 2:
                    return new l0(8);
                case 3:
                    return new j(2);
                case 4:
                    return new j4.a(list);
                case 5:
                    return new g4.a(list);
                case 6:
                    return new k4.b(list);
                case 7:
                    return new h4.a();
                case '\b':
                    return new i4.d();
            }
        }
        throw new IllegalArgumentException(r.b.k("Unsupported MIME type: ", str));
    }

    @Override
    public boolean f0() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f1(gj gjVar) {
        int i7 = this.f21105a;
        return y0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g() {
        switch (this.f21105a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f21105a;
    }

    @Override
    public String h(q1 q1Var) {
        switch (this.f21105a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object i(r7 r7Var) {
        return new pb.d(r7Var.c(pb.h.class));
    }

    @Override
    public int i0(q1 q1Var) {
        switch (this.f21105a) {
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i1() {
        int i7 = this.f21105a;
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f21105a;
    }

    @Override
    public void j0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void j2(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void k() {
        int i7 = this.f21105a;
    }

    @Override
    public void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f21105a;
    }

    @Override
    public Object l(Uri uri, j2.k kVar) {
        return Long.valueOf(h2.l0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public boolean l0() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l2(q1 q1Var, long j3) {
        int i7 = this.f21105a;
    }

    @Override
    public void m(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f21105a;
    }

    @Override
    public void n0(String str) {
        int i7 = this.f21105a;
    }

    @Override
    public void o(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean o0(p5 p5Var) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i7 = this.f21105a;
    }

    @Override
    public void p1(q1 q1Var, int i7) {
        int i10 = this.f21105a;
    }

    @Override
    public boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
        int i7;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i7 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i7 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i7 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i7 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        if (i11 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void q0(q1 q1Var, float f10, float f11) {
        int i7 = this.f21105a;
    }

    @Override
    public void q2(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void r(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public void s2() {
        int i7 = this.f21105a;
    }

    @Override
    public void t() {
        int i7 = this.f21105a;
    }

    @Override
    public int t0() {
        return 0;
    }

    @Override
    public void t1(q1 q1Var, float f10, float f11) {
        int i7 = this.f21105a;
    }

    @Override
    public void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.f21105a;
    }

    @Override
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override
    public void u(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean v2(int i7) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void w(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void w0(q1 q1Var, float f10, float f11, boolean z10) {
        int i7 = this.f21105a;
    }

    @Override
    public String x(long j3) {
        switch (this.f21105a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean x1() {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void x2() {
        int i7 = this.f21105a;
    }

    @Override
    public boolean y0(gj gjVar) {
        switch (this.f21105a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void y2(q1 q1Var, int i7, int i10) {
        int i11 = this.f21105a;
    }

    @Override
    public void z(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public void z0(q1 q1Var) {
        int i7 = this.f21105a;
    }

    @Override
    public boolean z1(q1 q1Var, int i7) {
        switch (this.f21105a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public i9 z2() {
        switch (this.f21105a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    private final void E() {
    }

    private final void F3() {
    }

    private final void G3() {
    }

    private final void J3() {
    }

    private final void K3() {
    }

    private final void M() {
    }

    private final void N3() {
    }

    private final void O3() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void U2() {
    }

    private final void V2() {
    }

    private final void k0() {
    }

    private final void k2() {
    }

    private final void m0() {
    }

    private final void m2() {
    }

    @Override
    public void n() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void s() {
    }

    @Override
    public void y() {
    }

    private final void A3(q1 q1Var) {
    }

    private final void C3(q1 q1Var) {
    }

    private final void E0(q1 q1Var) {
    }

    private final void E1(q1 q1Var) {
    }

    private final void E2(q1 q1Var) {
    }

    private final void F2(q1 q1Var) {
    }

    private final void G0(q1 q1Var) {
    }

    private final void G1(q1 q1Var) {
    }

    private final void K2(q1 q1Var) {
    }

    private final void L2(q1 q1Var) {
    }

    private final void L3(int i7) {
    }

    private final void M2(q1 q1Var) {
    }

    private final void M3(int i7) {
    }

    private final void N1(q1 q1Var) {
    }

    private final void N2(q1 q1Var) {
    }

    private final void O2(q1 q1Var) {
    }

    private final void P1(q1 q1Var) {
    }

    private final void P2(q1 q1Var) {
    }

    private final void Q3(gj gjVar) {
    }

    private final void R3(gj gjVar) {
    }

    private final void S0(q1 q1Var) {
    }

    private final void S2(q1 q1Var) {
    }

    private final void T2(q1 q1Var) {
    }

    private final void Y(q1 q1Var) {
    }

    private final void a1(q1 q1Var) {
    }

    private final void b0(q1 q1Var) {
    }

    private final void b1(dj djVar) {
    }

    private final void c1(dj djVar) {
    }

    private final void c3(String str) {
    }

    private final void d0(q1 q1Var) {
    }

    private final void d1(q1 q1Var) {
    }

    private final void d3(String str) {
    }

    private final void e1(q1 q1Var) {
    }

    private final void g0(q1 q1Var) {
    }

    private final void i3(q1 q1Var) {
    }

    private final void j1(q1 q1Var) {
    }

    private final void j3(q1 q1Var) {
    }

    private final void l1(q1 q1Var) {
    }

    private final void m3(q1 q1Var) {
    }

    private final void n3(q1 q1Var) {
    }

    private final void o1(q1 q1Var) {
    }

    private final void o3(gj gjVar) {
    }

    private final void p0(q1 q1Var) {
    }

    private final void p3(gj gjVar) {
    }

    private final void q1(q1 q1Var) {
    }

    private final void q3(q1 q1Var) {
    }

    private final void r3(q1 q1Var) {
    }

    private final void s0(q1 q1Var) {
    }

    private final void u3(q1 q1Var) {
    }

    private final void v3(q1 q1Var) {
    }

    @Override
    public void b(x1 x1Var) {
    }

    private final void C(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void D(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void G2(String str, String str2) {
    }

    private final void H2(String str, String str2) {
    }

    private final void d2(q1 q1Var, int i7) {
    }

    private final void e3(q1 q1Var, long j3) {
    }

    private final void f3(q1 q1Var, long j3) {
    }

    private final void g1(q1 q1Var, o2 o2Var) {
    }

    private final void h1(q1 q1Var, o2 o2Var) {
    }

    private final void i2(q1 q1Var, int i7) {
    }

    private final void m1(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void n1(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void s3(q1 q1Var, l10 l10Var) {
    }

    private final void t3(q1 q1Var, l10 l10Var) {
    }

    private final void u1(q1 q1Var, int i7) {
    }

    private final void v0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v1(q1 q1Var, int i7) {
    }

    private final void w1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void w3(q1 q1Var, boolean z10) {
    }

    private final void x0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y3(q1 q1Var, boolean z10) {
    }

    @Override
    public void I(int i7, Object obj) {
    }

    private final void A(q1 q1Var, float f10, float f11) {
    }

    private final void B3(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void D3(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void I2(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void J2(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void Q0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void Q2(q1 q1Var, float f10, float f11) {
    }

    private final void R0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void R2(q1 q1Var, float f10, float f11) {
    }

    private final void W2(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void X2(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void k3(q1 q1Var, float f10, float f11) {
    }

    private final void l3(q1 q1Var, float f10, float f11) {
    }

    private final void n2(q1 q1Var, float f10, float f11) {
    }

    private final void o2(q1 q1Var, float f10, float f11) {
    }

    private final void r1(q1 q1Var, int i7, int i10) {
    }

    private final void s1(q1 q1Var, int i7, int i10) {
    }

    private final void v(q1 q1Var, float f10, float f11) {
    }

    private final void x3(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void z3(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void V1(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void Y2(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void Z2(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void a3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void b2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void b3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void r2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void u2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void B2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void C2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void D2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void g3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void h3(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void w2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void J0(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void K0(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void H3(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void I3(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
