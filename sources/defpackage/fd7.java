package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;
public final class fd7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public fd7(w68 w68Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.a = (byte) 27;
        this.b = w68Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd7.a():void");
    }

    private final void b() {
        int i;
        int i2;
        int i3;
        x08 x08Var = (x08) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
        int i4 = x08Var.M;
        b18 b18Var = x08Var.R;
        b18Var.A1();
        x08Var.K = false;
        if (tL_error == null) {
            x08Var.r();
            x08Var.q();
            b18Var.C1.c(b18Var.F, (String) b18Var.t1.get("phone"), null, null, null, null, null, null, null, null, new sz7(b18Var, (byte) 6), null);
            return;
        }
        x08Var.L = tL_error.text;
        if ((i4 == 3 && ((i3 = x08Var.N) == 4 || i3 == 2)) || ((i4 == 2 && ((i = x08Var.N) == 4 || i == 3)) || (i4 == 4 && x08Var.N == 2))) {
            x08Var.p();
        }
        if (i4 == 2) {
            hl.y3(true);
            jn7.e().a(x08Var, jn7.j4);
        } else if (i4 == 3) {
            hl.x3(true);
            jn7.e().a(x08Var, jn7.k4);
        }
        x08Var.J = true;
        if (i4 != 3) {
            i2 = ((e) b18Var).currentAccount;
            jj.c0(i2, tL_error, b18Var, verifyphone, new Object[0]);
        }
        b18Var.Q1(true, false);
        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                x08Var.c(true);
                b18Var.N1(null, 0, true);
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = x08Var.d;
            if (i5 < editTextBoldCursorArr.length) {
                editTextBoldCursorArr[i5].setText("");
                i5++;
            } else {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
        }
    }

    private final void c() {
        p pVar = (p) this.b;
        pVar.getClass();
        pVar.F0 = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
        ((pl7) this.d).run();
        pVar.J0(false);
        pVar.N0(true, false);
    }

    private final void d() {
        ((p) this.b).l0((TL_account.Password) this.c, (byte[]) this.d);
    }

    private final void e() {
        ((p) this.b).t0((TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd7.f():void");
    }

    private final void g() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        o5b o5bVar = (o5b) this.b;
        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
        pcc pccVar = (pcc) this.d;
        for (int i = 0; i < o5bVar.i.size(); i++) {
            r47 r47Var = (r47) o5bVar.i.get(i);
            if (r47Var != null && (storyItem = r47Var.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem2.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                pccVar.a(document2);
                return;
            }
        }
        pccVar.a(null);
    }

    private final void h() {
        j68 j68Var = (j68) this.b;
        x53 x53Var = (x53) this.c;
        o68 o68Var = j68Var.x;
        jj.P(o68Var.getContext(), null, x53Var, new o48(j68Var, (TL_stories.StoryItem) this.d, x53Var, (byte) 1));
        j68 j68Var2 = o68Var.d1;
        if (j68Var2 != null) {
            j68Var2.a();
        }
    }

    private final void i() {
        w68 w68Var = (w68) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tL_error == null) {
            w68Var.r1 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull N0 = uc7.s1(w68Var.a).N0(w68Var.p1);
            if (N0 != null) {
                N0.exported_invite = w68Var.r1;
            }
            w68Var.o1.setLink(w68Var.r1.link);
        }
        w68Var.q1 = false;
    }

    private final void j() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        y98 y98Var = (y98) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.B4.f0((Bitmap) this.c);
        photoViewer.s5.setUndoCutState(true);
        photoViewer.k2(true, true);
        hl.r(y98Var);
        hl.d3(y98Var, 800L);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd7.run():void");
    }

    public fd7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public fd7(Object obj, Object obj2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
    }
}
