package ab;

import af.h;
import android.content.Context;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.Editable;
import android.text.Selection;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import e2.c;
import fh.f;
import h3.t1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import jh.z1;
import l.x;
import m9.b;
import n2.v;
import oa.l;
import oa.m;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.t5;
import org.telegram.ui.ou0;
import org.xml.sax.Attributes;
import y3.u;
import z8.d;
import z8.e;

public class a implements c, j6.c, kf.a, e, x, b, n9.a, m, j1, ei, d, u, OnFailureListener {

    public final int f214a;

    public a(int i10) {
        this.f214a = i10;
    }

    public static long A3(v vVar) {
        Throwable cause = (IOException) vVar.f18187c;
        if ((cause instanceof t1) || (cause instanceof FileNotFoundException) || (cause instanceof e0) || (cause instanceof p0)) {
            return -9223372036854775807L;
        }
        int i10 = n.f3009b;
        while (cause != null) {
            if ((cause instanceof n) && ((n) cause).f3010a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((vVar.f18186b - 1) * 1000, 5000);
    }

    public static boolean B3(q1.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int iMin;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int iMax = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z11) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z11) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z11 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i11, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z12) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    iMin = Math.min(selectionEnd + i11, editable.length());
                }
                androidx.emoji2.text.u[] uVarArr = (androidx.emoji2.text.u[]) editable.getSpans(selectionStart, iMin, androidx.emoji2.text.u.class);
                if (uVarArr != null && uVarArr.length > 0) {
                    for (androidx.emoji2.text.u uVar : uVarArr) {
                        int spanStart = editable.getSpanStart(uVar);
                        int spanEnd = editable.getSpanEnd(uVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static m9.a C(a aVar) {
        return new m9.a(System.currentTimeMillis() + ((long) 3600000), new com.google.android.gms.internal.cast.a(8), new jb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static boolean C3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String strA = gf.m.a("data-document-id", attributes);
                if (strA != null) {
                    editable.setSpan(new t5(Long.parseLong(strA), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), t5.class);
                if (spans.length != 0) {
                    for (int length = spans.length; length > 0; length--) {
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                    }
                }
                Object obj2 = (t5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new gf.n(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object objY3 = y3(editable, 0);
            if (objY3 != null) {
                int spanStart2 = editable.getSpanStart(objY3);
                editable.removeSpan(objY3);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(objY3, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z10) {
                String strA2 = gf.m.a("language", attributes);
                if (strA2 == null) {
                    strA2 = gf.m.a("lang", attributes);
                }
                if (strA2 == null) {
                    strA2 = gf.m.a("lng", attributes);
                }
                editable.setSpan(new gf.n(strA2), editable.length(), editable.length(), 17);
                return true;
            }
            Object objY4 = y3(editable, 1);
            if (objY4 != null) {
                int spanStart3 = editable.getSpanStart(objY4);
                editable.removeSpan(objY4);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(objY4, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new gf.n(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object objY5 = y3(editable, 3);
                if (objY5 != null) {
                    int spanStart4 = editable.getSpanStart(objY5);
                    editable.removeSpan(objY5);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(objY5, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            String strA3 = gf.m.a("class", attributes);
            if (gf.m.a("data-collapsed", attributes) != null || (strA3 != null && strA3.contains("telegram-collapsed-quote"))) {
                z11 = true;
            }
            editable.setSpan(new gf.n(z11 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        gf.n[] nVarArr = (gf.n[]) editable.getSpans(0, editable.length(), gf.n.class);
        for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
            gf.n nVar = nVarArr[length2];
            if (editable.getSpanFlags(nVar) == 17 && ((i10 = nVar.f7040a) == 2 || i10 == 3)) {
                obj = nVar;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    public static k0 x3(j0 j0Var, v vVar) {
        IOException iOException = (IOException) vVar.f18187c;
        if (!(iOException instanceof h0)) {
            return null;
        }
        int i10 = ((h0) iOException).d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (j0Var.a(1)) {
            return new k0(1, 300000L);
        }
        if (j0Var.a(2)) {
            return new k0(2, 60000L);
        }
        return null;
    }

    public static gf.n y3(Editable editable, int i10) {
        gf.n[] nVarArr = (gf.n[]) editable.getSpans(0, editable.length(), gf.n.class);
        if (nVarArr.length == 0) {
            return null;
        }
        for (int length = nVarArr.length; length > 0; length--) {
            int i11 = length - 1;
            if (editable.getSpanFlags(nVarArr[i11]) == 17) {
                gf.n nVar = nVarArr[i11];
                if (nVar.f7040a == i10) {
                    return nVar;
                }
            }
        }
        return null;
    }

    @Override
    public int A(Context context, String str) {
        return j6.e.a(context, str);
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f214a) {
        }
        return true;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public void B0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void B1(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void C0() {
        int i10 = this.f214a;
    }

    @Override
    public int C1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public void D(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int iMin = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(xa.a.q3(s10, s11));
            }
        }
    }

    @Override
    public void D1(MessageObject messageObject) {
        int i10 = this.f214a;
    }

    @Override
    public void E0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f214a;
    }

    @Override
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f214a) {
        }
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public void F0(s1 s1Var, float f10, float f11) {
        int i10 = this.f214a;
    }

    @Override
    public CharacterStyle F1(s1 s1Var) {
        switch (this.f214a) {
        }
        return null;
    }

    public boolean F3(CharSequence charSequence) {
        return false;
    }

    @Override
    public void G0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f214a;
    }

    @Override
    public void H(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void H0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public boolean H1(s1 s1Var, MessageObject messageObject) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void I1() {
        int i10 = this.f214a;
    }

    @Override
    public void J0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f214a;
    }

    @Override
    public void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f214a;
    }

    @Override
    public boolean L0(long j10) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f214a;
    }

    @Override
    public void M(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void M0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public boolean N0() {
        return false;
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f214a;
    }

    @Override
    public void O0(int i10, s1 s1Var) {
        int i11 = this.f214a;
    }

    @Override
    public ou0 O1() {
        switch (this.f214a) {
        }
        return null;
    }

    @Override
    public m9.a P1(a aVar, JSONObject jSONObject) {
        return C(aVar);
    }

    @Override
    public void Q(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f214a;
    }

    @Override
    public boolean Q1(long j10) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void R(int i10, s1 s1Var) {
        int i11 = this.f214a;
    }

    @Override
    public void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f214a;
    }

    @Override
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        int i11 = this.f214a;
    }

    @Override
    public boolean S0(s1 s1Var, boolean z10) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void T(MessageObject messageObject) {
        int i10 = this.f214a;
    }

    @Override
    public boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void U0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public boolean V() {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public boolean W(s1 s1Var) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void W0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public boolean X() {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11 = this.f214a;
    }

    @Override
    public boolean Y0(int i10, s1 s1Var) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void Z(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void Z1(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public StackTraceElement[] a0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        int i10 = this.f214a;
        return rl.a(messageObject);
    }

    @Override
    public void a2(s1 s1Var, f fVar) {
        int i10 = this.f214a;
    }

    @Override
    public int b0() {
        switch (this.f214a) {
        }
        return 0;
    }

    @Override
    public void b2(s1 s1Var, long j10) {
        int i10 = this.f214a;
    }

    @Override
    public List c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (z8.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f50218a;
            if (str != null) {
                aVar = new z8.a(str, aVar.f50219b, aVar.f50220c, aVar.d, aVar.f50221e, new z1(3, str, aVar), aVar.f50223g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public boolean d() {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public qg.a d0() {
        switch (this.f214a) {
        }
        return null;
    }

    @Override
    public void d1() {
        int i10 = this.f214a;
    }

    @Override
    public void d2(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override
    public boolean e0(s1 s1Var) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f214a;
    }

    @Override
    public boolean f() {
        switch (this.f214a) {
        }
        return true;
    }

    @Override
    public boolean f0(s1 s1Var, TLRPC.User user) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public Object f2() {
        switch (this.f214a) {
            case 17:
                return new ArrayList();
            default:
                return new l(true);
        }
    }

    @Override
    public int g(Context context, String str, boolean z10) {
        return j6.e.d(context, str, z10);
    }

    @Override
    public String h(s1 s1Var) {
        switch (this.f214a) {
        }
        return null;
    }

    @Override
    public void h1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f214a;
    }

    @Override
    public void h2() {
        int i10 = this.f214a;
    }

    @Override
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void i0(int i10) {
        int i11 = this.f214a;
    }

    @Override
    public void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i10 = this.f214a;
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f214a;
    }

    @Override
    public boolean j0() {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void k() {
        int i10 = this.f214a;
    }

    @Override
    public void k0(s1 s1Var, float f10, float f11) {
        int i10 = this.f214a;
    }

    @Override
    public boolean k2(int i10) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public boolean l(l.l lVar) {
        return false;
    }

    @Override
    public int l0(s1 s1Var) {
        switch (this.f214a) {
        }
        return 0;
    }

    @Override
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void m0(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void m1(s1 s1Var, float f10, float f11) {
        int i10 = this.f214a;
    }

    @Override
    public void m2() {
        int i10 = this.f214a;
    }

    @Override
    public void n(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override
    public void n2(s1 s1Var, int i10, int i11) {
        int i12 = this.f214a;
    }

    @Override
    public void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f214a;
    }

    @Override
    public k9 o2() {
        switch (this.f214a) {
        }
        return null;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public boolean p0() {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void q() {
        int i10 = this.f214a;
    }

    @Override
    public int r() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void r0(String str) {
        int i10 = this.f214a;
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public boolean s0(t5 t5Var) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public boolean s1() {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void t(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void t0(s1 s1Var, float f10, float f11) {
        int i10 = this.f214a;
    }

    @Override
    public void u() {
        int i10 = this.f214a;
    }

    @Override
    public Object u0(h hVar) {
        switch (this.f214a) {
            case 24:
                return new a(0);
            default:
                return new za.b(0);
        }
    }

    @Override
    public void u1(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void v(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f214a;
    }

    @Override
    public void v1(s1 s1Var, boolean z10) {
        int i10 = this.f214a;
    }

    @Override
    public void x(s1 s1Var) {
        int i10 = this.f214a;
    }

    @Override
    public void x0(s1 s1Var, float f10, float f11, boolean z10) {
        int i10 = this.f214a;
    }

    @Override
    public boolean x1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f214a) {
        }
        return false;
    }

    @Override
    public void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f214a;
    }

    @Override
    public String z(long j10) {
        switch (this.f214a) {
        }
        return null;
    }

    @Override
    public boolean z1() {
        switch (this.f214a) {
        }
        return false;
    }

    public int z3(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    private final void D3() {
    }

    private final void E3() {
    }

    private final void I3() {
    }

    private final void J3() {
    }

    private final void M3() {
    }

    private final void N() {
    }

    private final void N3() {
    }

    private final void P() {
    }

    private final void P2() {
    }

    private final void Q2() {
    }

    private final void Q3() {
    }

    private final void R3() {
    }

    private final void q0() {
    }

    private final void r2() {
    }

    private final void s2() {
    }

    private final void w0() {
    }

    @Override
    public void F() {
    }

    @Override
    public void w() {
    }

    private final void A1(s1 s1Var) {
    }

    private final void B2(s1 s1Var) {
    }

    private final void C2(s1 s1Var) {
    }

    private final void F2(s1 s1Var) {
    }

    private final void G2(s1 s1Var) {
    }

    private final void H2(s1 s1Var) {
    }

    private final void I2(s1 s1Var) {
    }

    private final void J2(s1 s1Var) {
    }

    private final void K2(s1 s1Var) {
    }

    private final void K3(int i10) {
    }

    private final void L3(int i10) {
    }

    private final void N2(s1 s1Var) {
    }

    private final void O2(s1 s1Var) {
    }

    private final void O3(MessageObject messageObject) {
    }

    private final void P3(MessageObject messageObject) {
    }

    private final void S(s1 s1Var) {
    }

    private final void T0(s1 s1Var) {
    }

    private final void V0(s1 s1Var) {
    }

    private final void X1(s1 s1Var) {
    }

    private final void X2(String str) {
    }

    private final void Y1(s1 s1Var) {
    }

    private final void Y2(String str) {
    }

    private final void c0(s1 s1Var) {
    }

    private final void d3(s1 s1Var) {
    }

    private final void e2(s1 s1Var) {
    }

    private final void e3(s1 s1Var) {
    }

    private final void f1(s1 s1Var) {
    }

    private final void g1(s1 s1Var) {
    }

    private final void g2(s1 s1Var) {
    }

    private final void h0(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void i1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void i3(s1 s1Var) {
    }

    private final void j1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void j3(MessageObject messageObject) {
    }

    private final void k1(s1 s1Var) {
    }

    private final void k3(MessageObject messageObject) {
    }

    private final void l1(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void o0(s1 s1Var) {
    }

    private final void p1(s1 s1Var) {
    }

    private final void p3(s1 s1Var) {
    }

    private final void q1(s1 s1Var) {
    }

    private final void q3(s1 s1Var) {
    }

    private final void r3(s1 s1Var) {
    }

    private final void t3(s1 s1Var) {
    }

    private final void v3(s1 s1Var) {
    }

    private final void w1(s1 s1Var) {
    }

    private final void w3(s1 s1Var) {
    }

    private final void y0(s1 s1Var) {
    }

    private final void z0(s1 s1Var) {
    }

    @Override
    public void I(Object obj) {
    }

    @Override
    public void g0(TLRPC.User user) {
    }

    private final void D2(s1 s1Var, TLRPC.Document document) {
    }

    private final void E2(s1 s1Var, TLRPC.Document document) {
    }

    private final void I0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void J(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void K(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void K0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void S1(int i10, s1 s1Var) {
    }

    private final void T1(int i10, s1 s1Var) {
    }

    private final void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void W1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void Z2(s1 s1Var, long j10) {
    }

    private final void a3(s1 s1Var, long j10) {
    }

    private final void n1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void n3(s1 s1Var, f fVar) {
    }

    private final void o1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void o3(s1 s1Var, f fVar) {
    }

    private final void p2(int i10, s1 s1Var) {
    }

    private final void q2(int i10, s1 s1Var) {
    }

    private final void r1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void s3(s1 s1Var, boolean z10) {
    }

    private final void t1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void u3(s1 s1Var, boolean z10) {
    }

    @Override
    public void b(l.l lVar, boolean z10) {
    }

    private final void E(s1 s1Var, float f10, float f11) {
    }

    private final void G(s1 s1Var, float f10, float f11) {
    }

    private final void J1(s1 s1Var, int i10, int i11) {
    }

    private final void L2(s1 s1Var, float f10, float f11) {
    }

    private final void M2(s1 s1Var, float f10, float f11) {
    }

    private final void N1(s1 s1Var, int i10, int i11) {
    }

    private final void R2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void S2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void b1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void c1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void f3(s1 s1Var, float f10, float f11) {
    }

    private final void g3(s1 s1Var, float f10, float f11) {
    }

    private final void t2(s1 s1Var, float f10, float f11) {
    }

    private final void u2(s1 s1Var, float f10, float f11) {
    }

    private final void T2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void U2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void V2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void W2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void j2(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final void l2(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final void v2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void w2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void A2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final void b3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void c3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void y2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void z2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final void X0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final void Z0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final void G3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void H3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
