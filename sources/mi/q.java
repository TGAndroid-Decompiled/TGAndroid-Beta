package mi;

import ah.t;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import k2.w0;
import n4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z01;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.cw;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.m5;
import org.telegram.ui.xu0;
import s4.g1;
import s4.h1;
import sg.a1;
public final class q implements ne.f, fp0, k1, cm0, gh.a, n5.b, y2.n, SuccessContinuation {
    public final int f17035a;
    public Object f17036b;
    public Object f17037c;

    public q(int i10, byte b10) {
        this.f17035a = i10;
    }

    @Override
    public boolean B1() {
        return false;
    }

    public void C() {
        String str = (String) this.f17036b;
        try {
            ca.c cVar = (ca.c) this.f17037c;
            cVar.getClass();
            new File(cVar.f5051b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override
    public void E() {
        ((ne.k) this.f17036b).e((ne.l) this.f17037c);
    }

    @Override
    public void G1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    public ArrayList H() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f17036b;
        Class cls = (Class) ((w0) this.f17037c).f14874b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new r9.c(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public CharacterStyle H1(t1 t1Var) {
        return null;
    }

    public View J(int i10, int i11, int i12, int i13) {
        int i14;
        g1 g1Var = (g1) this.f17037c;
        h1 h1Var = (h1) this.f17036b;
        int m10 = h1Var.m();
        int o10 = h1Var.o();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View t10 = h1Var.t(i10);
            int d = h1Var.d(t10);
            int y3 = h1Var.y(t10);
            g1Var.f46390b = m10;
            g1Var.f46391c = o10;
            g1Var.d = d;
            g1Var.e = y3;
            if (i12 != 0) {
                g1Var.f46389a = i12;
                if (g1Var.a()) {
                    return t10;
                }
            }
            if (i13 != 0) {
                g1Var.f46389a = i13;
                if (g1Var.a()) {
                    view = t10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override
    public boolean J0(long j10) {
        return ((z01) this.f17037c).v;
    }

    @Override
    public boolean J1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void L(float f7, boolean z10) {
        m5.f39441c = f7;
        ((TextView) this.f17036b).setText("Saturation " + (f7 * 5.0f));
        nw0 nw0Var = ((m5) this.f17037c).f39442b;
        nw0Var.M();
        nw0Var.L();
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public boolean O() {
        o5 o5Var = (o5) this.f17037c;
        if (o5Var.H0 <= 0.0f && !o5Var.v0()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public xu0 P1() {
        return null;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q1(long j10) {
        return ((z01) this.f17037c).f33113s;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public boolean U(v vVar, String str) {
        Context context = (Context) this.f17036b;
        int i10 = vVar.f17192b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, vVar.f17191a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, vVar.f17193c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public ih.a W() {
        return null;
    }

    public boolean X(View view) {
        g1 g1Var = (g1) this.f17037c;
        h1 h1Var = (h1) this.f17036b;
        int m10 = h1Var.m();
        int o10 = h1Var.o();
        int d = h1Var.d(view);
        int y3 = h1Var.y(view);
        g1Var.f46390b = m10;
        g1Var.f46391c = o10;
        g1Var.d = d;
        g1Var.e = y3;
        g1Var.f46389a = 24579;
        return g1Var.a();
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public boolean Z(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public void a() {
        ((ne.k) this.f17036b).a();
    }

    public int a0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f17036b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.f17037c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public boolean b2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        ey eyVar = (ey) this.f17037c;
        if (view instanceof q2) {
            q2 q2Var = (q2) view;
            if (q2Var.f22984n2) {
                eyVar.L4(q2Var.getDialogId(), view);
                return true;
            }
        }
        cw cwVar = eyVar.f37142z0;
        if (cwVar != null && cwVar.getVisibility() == 0 && eyVar.f37142z0.f29721n) {
            return false;
        }
        return eyVar.m4(view, i10, f7, ((dy) this.f17036b).d);
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public dh.d d() {
        return new dh.f(this);
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return b1.a(messageObject);
    }

    @Override
    public Object d2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.f17036b).d2(uri, kVar);
        List list = (List) this.f17037c;
        if (list != null && !list.isEmpty()) {
            return (t2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        Object mo27get = ((hd.a) this.f17036b).mo27get();
        hd.a aVar2 = (hd.a) this.f17037c;
        return new s5.g(bVar, aVar, s5.a.f46518f, (s5.i) mo27get, aVar2);
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ey) this.f17037c).finishPreviewFragment();
        }
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ey) this.f17037c).movePreviewFragment(f7);
        }
    }

    @Override
    public boolean o0(y5 y5Var) {
        return false;
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public Task then(Object obj) {
        ea.a aVar = (ea.a) obj;
        u4.f fVar = (u4.f) this.f17037c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        n2.e eVar = (n2.e) fVar.f48041c;
        x9.m.b((x9.m) ((n2.e) fVar.f48041c).f17103c);
        ((x9.m) eVar.f17103c).f50149m.v((Executor) this.f17036b, null);
        ((x9.m) eVar.f17103c).f50153q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f17035a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f17037c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f17036b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 17:
                return "Bounds{lower=" + ((i0.b) this.f17036b) + " upper=" + ((i0.b) this.f17037c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public boolean u(float f7) {
        return false;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        String trim = ((EditTextBoldCursor) this.f17036b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((z01) this.f17037c).f33113s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        Paint paint = (Paint) this.f17036b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f17037c;
        a1 a1Var = premiumPreviewFragment.m0;
        if (premiumPreviewFragment.f33812h0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(k6.f21126a7));
            canvas.drawRect(f7, f10, f11, f12, paint);
            return;
        }
        a1Var.d(0, (-premiumPreviewFragment.f33807d0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33804b0, 0, premiumPreviewFragment.f33807d0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.f33807d0.getMeasuredHeight());
        canvas.drawRect(f7, f10, f11, f12, a1Var.f46618f);
    }

    public void z(Object obj, String str) {
        ((ArrayList) this.f17036b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    @Override
    public boolean z1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public q(int i10, Object obj, Object obj2) {
        this.f17035a = i10;
        this.f17036b = obj;
        this.f17037c = obj2;
    }

    public q(Object obj, Object obj2, boolean z10, int i10) {
        this.f17035a = i10;
        this.f17037c = obj;
        this.f17036b = obj2;
    }

    public q(Object obj) {
        this.f17035a = 3;
        this.f17037c = obj;
        this.f17036b = new ArrayList();
    }

    public q(k6.e eVar) {
        this.f17035a = 4;
        this.f17036b = new SparseIntArray();
        n6.l.h(eVar);
        this.f17037c = eVar;
    }

    public q(Context context) {
        this.f17035a = 22;
        this.f17036b = context;
        this.f17037c = null;
    }

    public q(byte[] bArr) {
        this.f17035a = 1;
        this.f17036b = bArr;
    }

    public q(String str, String str2) {
        this.f17035a = 23;
        this.f17036b = str;
        this.f17037c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public q(h1 h1Var) {
        this.f17035a = 19;
        this.f17036b = h1Var;
        ?? obj = new Object();
        obj.f46389a = 0;
        this.f17037c = obj;
    }

    public q(int i10) {
        this.f17035a = 25;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f17036b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f17037c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public q(EditText editText) {
        this.f17035a = 15;
        this.f17036b = editText;
        q1.i iVar = new q1.i(editText);
        this.f17037c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.f44745b == null) {
            synchronized (q1.a.f44744a) {
                try {
                    if (q1.a.f44745b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            q1.a.f44746c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.f44745b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.f44745b);
    }

    public q(PremiumPreviewFragment premiumPreviewFragment) {
        this.f17035a = 13;
        this.f17037c = premiumPreviewFragment;
        this.f17036b = new Paint();
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B(t1 t1Var) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void D1(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void I(t1 t1Var) {
    }

    @Override
    public void K0(t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void T0(t1 t1Var) {
    }

    @Override
    public void U1(t1 t1Var) {
    }

    @Override
    public void V0(t1 t1Var) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void k(boolean z10) {
    }

    @Override
    public void m(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void w1(t1 t1Var) {
    }

    @Override
    public void x0(t1 t1Var) {
    }

    @Override
    public void L1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void v() {
    }

    @Override
    public void x() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K(int i10, t1 t1Var) {
    }

    @Override
    public void K1(t1 t1Var, t tVar) {
    }

    @Override
    public void M0(int i10, t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(t1 t1Var, long j10) {
    }

    @Override
    public void h1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void x1(t1 t1Var, boolean z10) {
    }

    @Override
    public void A0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void o2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void p1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void z0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void R1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
