package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e57 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public e57(dz6 dz6Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, na7 na7Var, ad7 ad7Var) {
        this.a = (byte) 17;
        this.c = dz6Var;
        this.h = str;
        this.d = tL_error;
        this.e = tLObject;
        this.b = na7Var;
        this.f = ad7Var;
    }

    private final void a() {
        vp9 vp9Var = (vp9) this.b;
        ArrayList arrayList = (ArrayList) this.f;
        vf6 vf6Var = (vf6) this.h;
        ArrayList arrayList2 = vp9Var.c;
        ArrayList arrayList3 = vp9Var.i;
        int i = vp9Var.a;
        na7.q1(i).a4((ArrayList) this.c, true);
        na7.q1(i).U3((ArrayList) this.d, true);
        vl.g(i).d((ArrayList) this.e);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            vp9Var.i(((Long) arrayList.get(i2)).longValue());
        }
        for (int i3 = 0; i3 < vf6Var.m(); i3++) {
            long j = vf6Var.j(i3);
            k27 k27Var = new k27(vp9Var.a, (TLRPC.Message) vf6Var.n(i3), null, null, null, null, null, false, false, 0L, false, false, true, 0);
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                up9 up9Var = (up9) arrayList3.get(i4);
                if (up9Var.a == j) {
                    up9Var.c = k27Var.e1();
                    up9Var.d = k27Var;
                }
            }
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                up9 up9Var2 = (up9) arrayList2.get(i5);
                if (up9Var2.a == j) {
                    up9Var2.c = k27Var.e1();
                    up9Var2.d = k27Var;
                }
            }
        }
        vp9Var.k();
    }

    private final void b() {
        vp9 vp9Var = (vp9) this.b;
        tp9 tp9Var = (tp9) this.h;
        vp9Var.k = false;
        vp9Var.l = true;
        int i = vp9Var.a;
        na7.q1(i).a4((ArrayList) this.c, true);
        na7.q1(i).U3((ArrayList) this.d, true);
        vl.g(i).d((ArrayList) this.e);
        ArrayList arrayList = vp9Var.c;
        arrayList.clear();
        arrayList.addAll((ArrayList) this.f);
        vp9Var.l();
        if (!vp9Var.m) {
            tp9Var.run();
        }
    }

    private final void c() {
        bu9 bu9Var = (bu9) this.b;
        hd hdVar = (hd) this.d;
        TLObject tLObject = (TLObject) this.e;
        byte[] bArr = (byte[]) this.f;
        TLRPC.User user = (TLRPC.User) this.h;
        bu9Var.n = false;
        if (!((Activity) this.c).isFinishing()) {
            try {
                hdVar.dismiss();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        bu9Var.getMessagesController().W3(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = cf3.E(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = bu9Var.getConnectionsManager().getCurrentTime();
        bu9Var.getMessagesController().R.k(tL_dialog, tL_dialog.id);
        bu9Var.getMessagesController().y.add(tL_dialog);
        bu9Var.getMessagesController().Y4(null);
        ad7 messagesStorage = bu9Var.getMessagesStorage();
        messagesStorage.a.c(new jw6(messagesStorage, encryptedChat, user, tL_dialog, (byte) 10));
        bu9Var.getNotificationCenter().k(kk7.r, new Object[0]);
        bu9Var.getNotificationCenter().k(kk7.Z, encryptedChat);
        Utilities.d.c(new zk9(bu9Var, (byte) 14));
    }

    private final void d() {
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        int L2;
        int i5;
        int i6;
        int i7;
        int i8;
        final iy9 iy9Var = (iy9) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
        if (tL_error != null) {
            if (iy9Var.e2 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (tL_inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iy9Var.e2);
                        if (hc2.V(iy9Var.S1)) {
                            i8 = 2131751310;
                        } else {
                            i8 = 2131751303;
                        }
                        String M0 = k96.M0(i8, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = gl.T2(k96.a0(null, null, 2131751280, iy9Var.S1.title, l7c.k(user, true)));
                        alertDialog$Builder.j(k96.M0(2131751284, null), new kq8(iy9Var, user, (byte) 17));
                        alertDialog$Builder.g(k96.M0(2131752577, null), new ed() {
                            @Override
                            public final void u(hd hdVar2, int i9) {
                                byte b = r2;
                                iy9 iy9Var2 = iy9Var;
                                switch (b) {
                                    case 0:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S = LaunchActivity.S();
                                        if (S != null) {
                                            iy9Var2.dismiss();
                                            S.presentFragment(new p3c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    default:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(iy9Var.a).sendRequest(new TL_account.getPassword(), new ck8(iy9Var, twoStepVerificationActivity, user, (byte) 6), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (iy9Var.e2 != null && !y6c.h(j5.a(iy9Var.a).a).p()) {
                            d S = LaunchActivity.S();
                            if (S != null) {
                                new h26(5, iy9Var.a, null, iy9Var.e2, S);
                                return;
                            }
                            return;
                        }
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            iy9Var.dismiss();
                            S2.presentFragment(new zsb(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.s0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        d S3 = LaunchActivity.S();
                        if (S3 != null) {
                            ij.e0(tL_error, S3, hc2.V(iy9Var.S1), hc2.Y(iy9Var.S1), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(iy9Var.e2);
                    alertDialog$Builder2.a.S = k96.M0(2131751285, null);
                    LinearLayout linearLayout = new LinearLayout(iy9Var.e2);
                    linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(iy9Var.e2);
                    int i9 = bkb.i5;
                    zkb.X(textView, i9, null);
                    textView.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    if (hc2.V(iy9Var.S1)) {
                        de9.r(null, null, 2131751271, new Object[]{l7c.k(user, true)}, textView);
                    } else {
                        de9.r(null, null, 2131751289, new Object[]{l7c.k(user, true)}, textView);
                    }
                    linearLayout.addView(textView, nme.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(iy9Var.e2);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(iy9Var.e2);
                    imageView.setImageResource(2131231627);
                    if (k96.a0) {
                        i2 = gl.L(11.0f);
                    } else {
                        i2 = 0;
                    }
                    int L3 = gl.L(9.0f);
                    if (k96.a0) {
                        L = 0;
                    } else {
                        L = gl.L(11.0f);
                    }
                    imageView.setPadding(i2, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    zkb.s(imageView, i9, null, mode);
                    TextView textView2 = new TextView(iy9Var.e2);
                    zkb.X(textView2, i9, null);
                    textView2.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 48);
                    textView2.setText(gl.T2(k96.M0(2131751288, null)));
                    if (k96.a0) {
                        linearLayout2.addView(textView2, nme.o(-1, -2));
                        linearLayout2.addView(imageView, nme.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, nme.o(-2, -2));
                        linearLayout2.addView(textView2, nme.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(iy9Var.e2);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(iy9Var.e2);
                    imageView2.setImageResource(2131231627);
                    if (k96.a0) {
                        i4 = gl.L(11.0f);
                    } else {
                        i4 = 0;
                    }
                    int L4 = gl.L(9.0f);
                    if (k96.a0) {
                        L2 = 0;
                    } else {
                        L2 = gl.L(11.0f);
                    }
                    imageView2.setPadding(i4, L4, L2, 0);
                    zkb.s(imageView2, i9, null, mode);
                    TextView textView3 = new TextView(iy9Var.e2);
                    zkb.X(textView3, i9, null);
                    textView3.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    textView3.setGravity(i5 | 48);
                    textView3.setText(gl.T2(k96.M0(2131751287, null)));
                    if (k96.a0) {
                        linearLayout3.addView(textView3, nme.o(-1, -2));
                        i6 = 5;
                        linearLayout3.addView(imageView2, nme.r(-2, -2, 5));
                    } else {
                        i6 = 5;
                        linearLayout3.addView(imageView2, nme.o(-2, -2));
                        linearLayout3.addView(textView3, nme.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.j(k96.M0(2131751279, null), new ed() {
                            @Override
                            public final void u(hd hdVar2, int i92) {
                                byte b = r2;
                                iy9 iy9Var2 = iy9Var;
                                switch (b) {
                                    case 0:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            iy9Var2.dismiss();
                                            S4.presentFragment(new p3c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    default:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.g(k96.M0(2131752577, null), new ed() {
                            @Override
                            public final void u(hd hdVar2, int i92) {
                                byte b = r2;
                                iy9 iy9Var2 = iy9Var;
                                switch (b) {
                                    case 0:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            iy9Var2.dismiss();
                                            S4.presentFragment(new p3c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    default:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(iy9Var.e2);
                        zkb.X(textView4, i9, null);
                        textView4.setTextSize(1, 16.0f);
                        if (k96.a0) {
                            i7 = i6;
                        } else {
                            i7 = 3;
                        }
                        de9.q(textView4, i7 | 48, null, 2131751286);
                        linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.g(k96.M0(2131747638, null), new ed() {
                            @Override
                            public final void u(hd hdVar2, int i92) {
                                byte b = r2;
                                iy9 iy9Var2 = iy9Var;
                                switch (b) {
                                    case 0:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            iy9Var2.dismiss();
                                            S4.presentFragment(new p3c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                    default:
                                        iy9Var2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (tL_inputCheckPasswordSRP != null) {
            eg egVar = iy9Var.U1;
            if (egVar != null) {
                egVar.run();
            }
            iy9Var.dismiss();
            twoStepVerificationActivity.s0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    private final void e() {
        z3a z3aVar = (z3a) this.b;
        String str = (String) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        g0b g0bVar = (g0b) this.f;
        u3a u3aVar = new u3a(z3aVar);
        u3aVar.f = (String) this.h;
        u3aVar.e = str;
        u3aVar.g = (String) this.d;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s3a s3aVar = (s3a) arrayList.get(i);
            File file = new File(s3aVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    u3aVar.h += length;
                    u3aVar.d.add(s3aVar);
                    u3aVar.a.put(s3aVar.a, s3aVar);
                    hashMap.put(s3aVar.a, u3aVar);
                }
            }
            if (i == 0) {
                gl.d3(new zk9(g0bVar, (byte) 26));
                return;
            }
        }
        gl.d3(new ex7(z3aVar, u3aVar, hashMap, str, g0bVar, (byte) 21));
    }

    private final void f() {
        z3a z3aVar = (z3a) this.b;
        TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
        k27 k27Var = (k27) this.d;
        File file = (File) this.f;
        k3a k3aVar = (k3a) this.e;
        String str = (String) this.h;
        if (tL_photo != null) {
            TLRPC.Message message = k27Var.k;
            message.media.photo = tL_photo;
            message.attachPath = file.toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(k27Var.k);
            z3aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, k27Var.r1 ? 1 : 0, 0L);
            z3aVar.getNotificationCenter().k(kk7.k0, k27Var.k);
            k3aVar.g = (TLRPC.PhotoSize) b00.f(1, tL_photo.sizes);
            k3aVar.h = tL_photo;
            k3aVar.l = null;
            if (k3aVar.e == 4) {
                k3aVar.p = true;
                z3aVar.L(k3aVar, k3aVar.x.indexOf(k27Var));
                return;
            }
            z3aVar.L(k3aVar, -1);
            return;
        }
        if (w01.a) {
            StringBuilder p = ug8.p("can't load image ", str, " to file ");
            p.append(file.toString());
            fa4.d(p.toString());
        }
        k3aVar.c();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e57.run():void");
    }

    public e57(hv0 hv0Var, File file, hd hdVar, String str, String str2, String str3) {
        this.a = (byte) 4;
        this.b = hv0Var;
        this.f = file;
        this.c = hdVar;
        this.h = str;
        this.d = str2;
        this.e = str3;
    }

    public e57(gk7 gk7Var, Object obj, Object obj2, String str, TLObject tLObject, Object obj3, byte b) {
        this.a = b;
        this.b = gk7Var;
        this.c = obj;
        this.d = obj2;
        this.h = str;
        this.e = tLObject;
        this.f = obj3;
    }

    public e57(vx7 vx7Var, TLRPC.TL_error tL_error, String str, bx7 bx7Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = (byte) 20;
        this.b = vx7Var;
        this.c = tL_error;
        this.h = str;
        this.d = bx7Var;
        this.e = tLObject;
        this.f = sendverifyphonecode;
    }

    public e57(z3a z3aVar, TLObject tLObject, TLRPC.InputMedia inputMedia, k3a k3aVar, String str, k27 k27Var) {
        this.a = (byte) 29;
        this.b = z3aVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = k3aVar;
        this.h = str;
        this.f = k27Var;
    }

    public e57(z3a z3aVar, TLRPC.TL_photo tL_photo, k27 k27Var, File file, k3a k3aVar, String str) {
        this.a = (byte) 28;
        this.b = z3aVar;
        this.c = tL_photo;
        this.d = k27Var;
        this.f = file;
        this.e = k3aVar;
        this.h = str;
    }

    public e57(File file, File file2, boolean[] zArr, p8c p8cVar, hd hdVar, boolean[] zArr2) {
        this.a = (byte) 16;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = p8cVar;
        this.e = hdVar;
        this.h = zArr2;
    }

    public e57(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public e57(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.h = str;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
