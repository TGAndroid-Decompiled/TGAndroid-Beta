package ig;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jg.e2;
import jg.o2;
import jg.v2;
import jg.w2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.f8;
import org.telegram.messenger.k6;
import org.telegram.messenger.nc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.oo0;
import v7.g8;
import vh.l5;
import w7.n6;
public final class c0 implements f0, fe.e, e2.o, f2.w, s1, u1, l5, OnSuccessListener, nc, a5.b, c0.j, m4.e0, m4.h1, e2.j, m4.f1, d9.k {
    public final int f8281a;
    public final Object f8282b;

    public c0(j2.a aVar, Object obj, int i10) {
        this.f8281a = i10;
        this.f8282b = obj;
    }

    @Override
    public void B() {
        float f7;
        cr0 cr0Var = (cr0) this.f8282b;
        TextView textView = cr0Var.f10171h1;
        boolean a2 = cr0Var.f10181o0.a();
        ImageView imageView = cr0Var.f10169f1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void a(long j10, e2.x xVar) {
        switch (this.f8281a) {
            case 6:
                c3.b.c(j10, xVar, ((j4.d0) this.f8282b).f9434c);
                return;
            default:
                c3.b.d(j10, xVar, ((j4.d0) this.f8282b).f9434c);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((m4.n1) obj).c((b2.z0) this.f8282b);
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f8281a) {
            case 25:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                i9.a aVar = (i9.a) ((n4.q) this.f8282b).f13528b;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return e0.f0.e(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = ((c5.x) this.f8282b).f3827b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return e0.f0.e(bitmap2);
        }
    }

    @Override
    public Typeface b() {
        return h0.a((Font) this.f8282b);
    }

    @Override
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        b5.h hVar2;
        ji.k kVar = (ji.k) this.f8282b;
        if (webView == kVar.f10464o && z10 && uri != null && kVar.f10456f.equals(uri.toString()) && kVar.j(webView)) {
            int i10 = aVar.f281b;
            if (i10 == 0) {
                aVar.h(0);
                String str = (String) aVar.f282c;
                if (!kVar.f10466q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (kVar.f10453a) {
                        if (!kVar.f10470u && kVar.f10467r && kVar.f10465p == hVar) {
                            if (str.length() - 14 > 1398112) {
                                kVar.h();
                                return;
                            } else {
                                kVar.f10460k.execute(new d1.e(28, kVar, str));
                                return;
                            }
                        }
                        return;
                    }
                }
                kVar.i(str, hVar);
            } else if (i10 == 1) {
                synchronized (kVar.f10453a) {
                    if (!kVar.f10470u && (hVar2 = kVar.f10465p) != null && hVar2 == hVar) {
                        aVar.h(1);
                        byte[] bArr = (byte[]) aVar.d;
                        Objects.requireNonNull(bArr);
                        kVar.f10460k.execute(new d1.e(29, kVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public Object d(c0.i iVar) {
        m4.f0 f0Var = (m4.f0) this.f8282b;
        f0Var.f12750o.post(new k2.u(18, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public void e(m4.v vVar, int i10) {
        vVar.c(i10, (b2.b1) this.f8282b);
    }

    @Override
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        int i11 = this.f8281a;
        Object obj = this.f8282b;
        switch (i11) {
            case 21:
                return f0Var.l(wVar, (e9.n0) obj);
            default:
                m4.f1 f1Var = (m4.f1) obj;
                j9.w wVar2 = j9.w.f9769b;
                if (!f0Var.j()) {
                    f1Var.g(f0Var.f12755t, wVar);
                    m4.j1.R0(f0Var, wVar, i10, new m4.t1(0));
                }
                return j9.w.f9769b;
        }
    }

    @Override
    public void g(m4.n1 n1Var, m4.w wVar) {
        ((e2.j) this.f8282b).accept(n1Var);
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f8281a) {
            case 10:
                ((oo0) this.f8282b).run();
                return;
            case 11:
                ((jg.i0) this.f8282b).f10016a.O1.r();
                return;
            case 27:
                ((mg.p1) this.f8282b).run();
                return;
            case 28:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f8282b;
                k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    mg.y0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            default:
                ((mg.n0) this.f8282b).run();
                return;
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f8282b, options);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8281a) {
            case 2:
                ((j2.b) obj).E((b2.y0) this.f8282b);
                return;
            case 3:
                ((j2.b) obj).onSeekStarted((j2.a) this.f8282b);
                return;
            case 4:
                ((j2.b) obj).b((i2.d) this.f8282b);
                return;
            default:
                ((j2.b) obj).j((u2.c0) this.f8282b);
                return;
        }
    }

    public bi.d0 k(android.support.v4.media.session.a0 a0Var) {
        InputStream inputStream;
        j5.b bVar = (j5.b) this.f8282b;
        URL url = (URL) a0Var.f875b;
        String c10 = n6.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f9674g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) a0Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                a4.l lVar = bVar.f9670a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                la.d dVar = (la.d) lVar.f279b;
                la.e eVar = new la.e(bufferedWriter, dVar.f11728a, dVar.f11729b, dVar.f11730c, dVar.d);
                eVar.h((k5.i) a0Var.f876c);
                eVar.j();
                eVar.f11732b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c11 = n6.c("CctTransportBackend");
                if (Log.isLoggable(c11, 4)) {
                    Log.i(c11, String.format("Status Code: %d", valueOf));
                }
                n6.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                n6.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new bi.d0(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        bi.d0 d0Var = new bi.d0(responseCode, null, k5.m.a(new BufferedReader(new InputStreamReader(inputStream))).f10915a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return d0Var;
                    } catch (Throwable th2) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                return new bi.d0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ja.b e) {
            e = e;
            n6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new bi.d0(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            n6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bi.d0(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            n6.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bi.d0(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            n6.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new bi.d0(400, null, 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.f8281a;
        Object obj2 = this.f8282b;
        switch (i10) {
            case 13:
                e2 e2Var = (e2) obj2;
                tb.b bVar = (tb.b) obj;
                e2Var.C0 = true;
                e2Var.B0 = false;
                return;
            case 14:
                o2 o2Var = (o2) obj2;
                tb.b bVar2 = (tb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar2.f48599a.size(); i11++) {
                    tb.a aVar = (tb.a) bVar2.f48599a.get(i11);
                    ?? obj3 = new Object();
                    obj3.f10296a = aVar.f48596a;
                    obj3.f10297b = aVar.d;
                    obj3.f10298c = aVar.e;
                    obj3.d = aVar.f48597b;
                    obj3.e = aVar.f48598c;
                    arrayList.add(obj3);
                }
                o2Var.a(arrayList);
                return;
            default:
                v2 v2Var = (v2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    f8.b("objimg: no objects");
                    return;
                }
                int i12 = ((qb.a) list.get(0)).f45519c;
                String str = null;
                if (g8.f50469a == null) {
                    g8.f50469a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i12 >= 0) {
                    String[] strArr = g8.f50469a;
                    if (i12 < strArr.length) {
                        str = strArr[i12];
                    }
                }
                v2Var.f10314c0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((qb.a) list.get(0)).f45519c);
                sb2.append(" ");
                sb2.append(v2Var.f10314c0);
                sb2.append(" ");
                a1.g.z(((qb.a) list.get(0)).f45517a, sb2);
                k6.g(v2Var.f10314c0);
                return;
        }
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ci0 B;
        w2 w2Var = (w2) this.f8282b;
        if (z10 && !z11 && (B = imageReceiver.B()) != null) {
            w2Var.q(B);
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ih.d.a((ih.d) this.f8282b);
    }

    public c0(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f8281a = 5;
        this.f8282b = c0Var;
    }

    public c0(Object obj, int i10) {
        this.f8281a = i10;
        this.f8282b = obj;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void E(float f7, int i10) {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }
}
