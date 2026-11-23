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
import b3.r;
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
import f3.y;
import h2.l0;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lf.b;
import org.telegram.messenger.a8;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import pb.h;
import u4.c;
import u9.d;
import yi.f;
public class a implements s0, e, k, i0, eg.a, l5.e, fg.a, ja.a, b, Continuation, d, r, f, gh.a, m1, OnFailureListener, c {
    public static final a f21560b = new a(14);
    public static a f21561c;
    public final int f21562a;

    public a(int i7) {
        this.f21562a = i7;
    }

    public static String P3(ad.c cVar) {
        String str = cVar.f1032a;
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
    public void A(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f21562a;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public void A2(r1 r1Var, int i7, int i10) {
        int i11 = this.f21562a;
    }

    @Override
    public void B(String str, Throwable th2) {
        a8.e("AudioRecorderV2 " + str, th2);
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.f21562a;
    }

    @Override
    public j9 B2() {
        switch (this.f21562a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void C(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11, boolean z10) {
        int i7 = this.f21562a;
    }

    @Override
    public void C1(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public String D(long j3) {
        switch (this.f21562a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int D0() {
        return 0;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            shortBuffer2.put(s5);
            shortBuffer2.put(s5);
        }
    }

    public Signature[] E3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void F(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean F0(fj fjVar) {
        switch (this.f21562a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean G(u uVar) {
        String str = uVar.f10759s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public void G0(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void H0() {
        int i7 = this.f21562a;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int I(u uVar) {
        String str = uVar.f10759s;
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
        throw new IllegalArgumentException(p5.c.k("Unsupported MIME type: ", str));
    }

    @Override
    public void I0(r1 r1Var, TLObject tLObject, boolean z10) {
        int i7 = this.f21562a;
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f21562a;
    }

    @Override
    public void J(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void J0(r1 r1Var, float f10, float f11) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean J1() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public b7.d K(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        dVar.f2914a = cVar.y(context, str);
        int i7 = 1;
        int l10 = cVar.l(context, str, true);
        dVar.f2915b = l10;
        int i10 = dVar.f2914a;
        if (i10 == 0) {
            i10 = 0;
            if (l10 == 0) {
                i7 = 0;
                dVar.f2916c = i7;
                return dVar;
            }
        }
        if (l10 < i10) {
            i7 = -1;
        }
        dVar.f2916c = i7;
        return dVar;
    }

    @Override
    public void K1(r1 r1Var, int i7) {
        int i10 = this.f21562a;
    }

    @Override
    public void L(r1 r1Var, p2 p2Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void L0(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void L1(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void M(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.f21562a;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7 * 2;
    }

    @Override
    public void N0(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void O(cj cjVar) {
        int i7 = this.f21562a;
    }

    @Override
    public void O1(fj fjVar) {
        int i7 = this.f21562a;
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f21562a;
    }

    @Override
    public int Q0() {
        return 0;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f21562a) {
            case 19:
            default:
                vf.c.t(r1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void R(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        switch (this.f21562a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void S0(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.f21562a;
    }

    @Override
    public float T0() {
        return -1.0f;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U1() {
        int i7 = this.f21562a;
    }

    @Override
    public float V0() {
        return -1.0f;
    }

    @Override
    public void W(fj fjVar) {
        int i7 = this.f21562a;
    }

    @Override
    public void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int X1() {
        return 0;
    }

    @Override
    public boolean Y() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean Z(r1 r1Var) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f21562a;
    }

    @Override
    public lf.a a(wf.b bVar) {
        return new gf.k(bVar);
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public boolean b0() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(r1 r1Var, h10 h10Var) {
        int i7 = this.f21562a;
    }

    @Override
    public Object c(r7 r7Var) {
        return new pb.d(r7Var.c(h.class));
    }

    @Override
    public void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f21562a;
    }

    @Override
    public boolean c1(r1 r1Var, boolean z10) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public fr0 c2() {
        switch (this.f21562a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean d() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d0(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void e() {
        int i7 = this.f21562a;
    }

    @Override
    public int e0() {
        switch (this.f21562a) {
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void e1(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void e2(String str, String str2) {
        int i7 = this.f21562a;
    }

    @Override
    public m f(u uVar) {
        String str = uVar.f10759s;
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
                    return new e4.h(list);
                case 1:
                    return new xi.e(2);
                case 2:
                    return new y(1);
                case 3:
                    return new j6.k(3);
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
        throw new IllegalArgumentException(p5.c.k("Unsupported MIME type: ", str));
    }

    @Override
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public void f1(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean f2(long j3) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object g(Uri uri, j2.k kVar) {
        return Long.valueOf(l0.V(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public boolean g1(fj fjVar) {
        int i7 = this.f21562a;
        return c0.a(fjVar);
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f21562a;
    }

    @Override
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
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
    public jh.a h0() {
        switch (this.f21562a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean i() {
        switch (this.f21562a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public boolean j0(r1 r1Var) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String k(r1 r1Var) {
        switch (this.f21562a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean k0(r1 r1Var, TLRPC.User user) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void k1() {
        int i7 = this.f21562a;
    }

    @Override
    public void k2(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void l2(r1 r1Var, long j3) {
        int i7 = this.f21562a;
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f21562a;
    }

    @Override
    public void m0(int i7) {
        int i10 = this.f21562a;
    }

    @Override
    public void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean n0() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 o(Class cls) {
        return new m0(true);
    }

    @Override
    public void o0(r1 r1Var, float f10, float f11) {
        int i7 = this.f21562a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i7 = this.f21562a;
    }

    @Override
    public int p0(r1 r1Var) {
        switch (this.f21562a) {
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void p1(r1 r1Var, int i7) {
        int i10 = this.f21562a;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f21562a;
    }

    @Override
    public void q0(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void q2(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean r0() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void t(r1 r1Var) {
        int i7 = this.f21562a;
    }

    @Override
    public void t0(String str) {
        int i7 = this.f21562a;
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
        int i7 = this.f21562a;
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
    public void u0(String str) {
        if (s2.f26829a) {
            a8.b("AudioRecorderV2 " + str);
        }
    }

    @Override
    public void u2() {
        int i7 = this.f21562a;
    }

    @Override
    public boolean v0(x5 x5Var) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.f21562a;
    }

    @Override
    public void x() {
        int i7 = this.f21562a;
    }

    @Override
    public void x0(r1 r1Var, float f10, float f11) {
        int i7 = this.f21562a;
    }

    @Override
    public boolean x1() {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int x2() {
        return 0;
    }

    @Override
    public boolean y2(int i7) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 z(Class cls, y1.b bVar) {
        return o(cls);
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        switch (this.f21562a) {
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void z2() {
        int i7 = this.f21562a;
    }

    private final void F3() {
    }

    private final void G3() {
    }

    private final void H() {
    }

    private final void J3() {
    }

    private final void K3() {
    }

    private final void N3() {
    }

    private final void O3() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void U() {
    }

    private final void U2() {
    }

    private final void V() {
    }

    private final void V2() {
    }

    private final void i2() {
    }

    private final void m2() {
    }

    private final void y() {
    }

    @Override
    public void n() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void u() {
    }

    @Override
    public void v() {
    }

    private final void A3(r1 r1Var) {
    }

    private final void C3(r1 r1Var) {
    }

    private final void E1(r1 r1Var) {
    }

    private final void E2(r1 r1Var) {
    }

    private final void F2(r1 r1Var) {
    }

    private final void G1(r1 r1Var) {
    }

    private final void K2(r1 r1Var) {
    }

    private final void L2(r1 r1Var) {
    }

    private final void L3(int i7) {
    }

    private final void M2(r1 r1Var) {
    }

    private final void M3(int i7) {
    }

    private final void N(r1 r1Var) {
    }

    private final void N1(r1 r1Var) {
    }

    private final void N2(r1 r1Var) {
    }

    private final void O2(r1 r1Var) {
    }

    private final void P0(r1 r1Var) {
    }

    private final void P1(r1 r1Var) {
    }

    private final void P2(r1 r1Var) {
    }

    private final void Q(r1 r1Var) {
    }

    private final void Q3(fj fjVar) {
    }

    private final void R3(fj fjVar) {
    }

    private final void S(r1 r1Var) {
    }

    private final void S2(r1 r1Var) {
    }

    private final void T(r1 r1Var) {
    }

    private final void T2(r1 r1Var) {
    }

    private final void U0(r1 r1Var) {
    }

    private final void X0(cj cjVar) {
    }

    private final void Y0(cj cjVar) {
    }

    private final void Z0(r1 r1Var) {
    }

    private final void a0(r1 r1Var) {
    }

    private final void b1(r1 r1Var) {
    }

    private final void c3(String str) {
    }

    private final void d3(String str) {
    }

    private final void g0(r1 r1Var) {
    }

    private final void i1(r1 r1Var) {
    }

    private final void i3(r1 r1Var) {
    }

    private final void j1(r1 r1Var) {
    }

    private final void j3(r1 r1Var) {
    }

    private final void m3(r1 r1Var) {
    }

    private final void n3(r1 r1Var) {
    }

    private final void o1(r1 r1Var) {
    }

    private final void o3(fj fjVar) {
    }

    private final void p3(fj fjVar) {
    }

    private final void q1(r1 r1Var) {
    }

    private final void q3(r1 r1Var) {
    }

    private final void r3(r1 r1Var) {
    }

    private final void u3(r1 r1Var) {
    }

    private final void v3(r1 r1Var) {
    }

    private final void w0(r1 r1Var) {
    }

    private final void y0(r1 r1Var) {
    }

    @Override
    public void b(x1 x1Var) {
    }

    private final void G2(String str, String str2) {
    }

    private final void H2(String str, String str2) {
    }

    private final void d1(r1 r1Var, p2 p2Var) {
    }

    private final void d2(r1 r1Var, int i7) {
    }

    private final void e3(r1 r1Var, long j3) {
    }

    private final void f3(r1 r1Var, long j3) {
    }

    private final void h1(r1 r1Var, p2 p2Var) {
    }

    private final void h2(r1 r1Var, int i7) {
    }

    private final void l0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void l1(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void n1(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void s0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void s3(r1 r1Var, h10 h10Var) {
    }

    private final void t3(r1 r1Var, h10 h10Var) {
    }

    private final void u1(r1 r1Var, int i7) {
    }

    private final void v1(r1 r1Var, int i7) {
    }

    private final void w(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void w1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void w3(r1 r1Var, boolean z10) {
    }

    private final void y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y3(r1 r1Var, boolean z10) {
    }

    @Override
    public void E(int i7, Object obj) {
    }

    private final void B3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void D3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void I2(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void J2(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void K0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final void O0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final void Q2(r1 r1Var, float f10, float f11) {
    }

    private final void R2(r1 r1Var, float f10, float f11) {
    }

    private final void W2(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void X2(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void j(r1 r1Var, float f10, float f11) {
    }

    private final void k3(r1 r1Var, float f10, float f11) {
    }

    private final void l(r1 r1Var, float f10, float f11) {
    }

    private final void l3(r1 r1Var, float f10, float f11) {
    }

    private final void n2(r1 r1Var, float f10, float f11) {
    }

    private final void o2(r1 r1Var, float f10, float f11) {
    }

    private final void r1(r1 r1Var, int i7, int i10) {
    }

    private final void s1(r1 r1Var, int i7, int i10) {
    }

    private final void x3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void z3(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void V1(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final void W1(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final void Y2(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void Z2(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void a3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void b3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void r2(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void s2(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void C2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void D2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void g3(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void h3(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void v2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void B0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void z0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void H3(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void I3(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
