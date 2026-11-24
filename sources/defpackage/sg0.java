package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
public final class sg0 implements ed, x74, p16, n8c, j8c, e39, iuc, no7, wv7, yk0, d39, cha, bha, eja, h8b, s29, CameraView.CameraViewDelegate, zb1, a93 {
    public final byte a;
    public final Object b;

    public sg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                yx0 yx0Var = (yx0) obj;
                yx0Var.s = vxcVar.a.f(2).d;
                yx0Var.invalidate();
                return vxc.b;
            default:
                io5 H0 = gl.H0(vxcVar, false);
                e11 e11Var = ((f11) obj).a;
                if (e11Var != null) {
                    e11Var.setPadding(H0.a, H0.b, H0.c, H0.d);
                }
                view.requestLayout();
                return vxc.b;
        }
    }

    @Override
    public final void a(b93 b93Var) {
        td1 td1Var = (td1) b93Var;
        td1Var.clear();
        ((ud1) this.b).b.add(td1Var);
    }

    @Override
    public final void b(yv7 yv7Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.b0;
        gba.B = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.z(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.e0();
        kk7.e().k(kk7.n0, yv7Var);
    }

    @Override
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override
    public final boolean d(int i, View view) {
        kca kcaVar = ((gr0) this.b).a0;
        if (!kcaVar.H.F1 && (view instanceof qfa)) {
            k27 messageObject = ((qfa) view).getMessageObject();
            if (kcaVar.c(messageObject)) {
                kcaVar.g(messageObject);
                return true;
            }
            kcaVar.e(messageObject);
            return true;
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        v51 v51Var = (v51) this.b;
        ArrayList arrayList = v51Var.c;
        if (((u51) arrayList.get(i)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i2 = v51Var.e;
            if (i2 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i2 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            cj3 cj3Var = new cj3(bundle);
            cj3Var.E2 = new q31(v51Var, cj3Var, (byte) 2);
            v51Var.presentFragment(cj3Var);
        } else if (((u51) arrayList.get(i)).a == 2) {
            m51 m51Var = ((u51) arrayList.get(i)).c;
            jv5 jv5Var = new jv5(v51Var, view.getContext());
            jv5Var.h(false);
            jv5Var.setParentWindow(ij.N(v51Var, jv5Var, view, f, f2));
            jv5Var.setCallback(new s51(v51Var, m51Var, (byte) 0));
        } else if (((u51) arrayList.get(i)).a == 4) {
            hd hdVar = ij.L(v51Var.getParentActivity(), k96.M0(2131747720, null), k96.M0(2131747721, null), k96.M0(2131751586, null), new nv0(v51Var, (byte) 9), null).a;
            hdVar.show();
            hdVar.h();
        }
    }

    @Override
    public final void f() {
        ((qw4) this.b).g();
    }

    @Override
    public final Object g(Integer num, Object obj) {
        kca kcaVar = (kca) this.b;
        Integer num2 = (Integer) obj;
        if (num.intValue() == -1) {
            new jr0(kcaVar.a, k96.M0(2131746500, null), new be2(kcaVar, (byte) 8)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final RecyclerView h(View view) {
        return ((d61) this.b).a(view);
    }

    @Override
    public final void i(WebView webView, qx qxVar, Uri uri, boolean z, zs5 zs5Var) {
        String uri2;
        cv0 cv0Var = (cv0) this.b;
        hv0 hv0Var = cv0Var.R;
        if (webView == cv0Var && hv0Var != null) {
            if (webView == hv0Var.a && !qxVar.b) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String i = hv0.i(uri2);
                if (hv0Var.u0 && (TextUtils.isEmpty(hv0Var.H0) || !TextUtils.equals(hv0Var.H0, i) || !TextUtils.equals(hv0Var.H0, hv0Var.getOriginHost()))) {
                    hv0Var.e("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                ev0 d = hv0Var.d();
                try {
                    qxVar.b(0);
                    String str = (String) qxVar.c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            gl.d3(new b87(hv0Var, webView, d, string, jSONObject.optString("eventData", null), (byte) 7));
                            return;
                        } else {
                            hv0Var.e("onBotWebMessage ignored: invalid event type");
                            return;
                        }
                    }
                    hv0Var.e("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e) {
                    fa4.g(e, true);
                    return;
                }
            }
            hv0Var.e("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 8:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                ((vo0) obj3).Z((c4c) obj);
                return;
            default:
                rs0 rs0Var = (rs0) obj3;
                c4c c4cVar = (c4c) obj;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                ss0 ss0Var = rs0Var.r;
                if (c4cVar.H instanceof TL_stars.StarsTransaction) {
                    jva.k1(rs0Var.getContext(), true, ss0Var.b, ss0.i0(ss0Var), (TL_stars.StarsTransaction) c4cVar.H, ss0.j0(ss0Var));
                    return;
                } else if (rs0Var.h) {
                    rs0Var.h = false;
                    rs0Var.a();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void k(int i) {
        gba.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i)).intValue()).apply();
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        o39 o39Var = (o39) recyclerView;
        tk0.a(o39Var, canvas, rectF, o39Var, (dha) this.b);
    }

    @Override
    public final void o(Canvas canvas, RectF rectF, float f) {
        b81 b81Var = (b81) ((i4d) this.b).a;
        Paint paint = b81Var.x;
        TextPaint textPaint = b81Var.e;
        paint.setAlpha((int) (80.0f * f));
        float R1 = gl.R1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f);
        canvas.drawRoundRect(rectF, R1, R1, paint);
        float i = Utilities.i((f - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / gl.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(b81Var.i0 + 1), rectF.centerX(), rectF.centerY() + gl.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public final void onCameraInit() {
        da1 da1Var = (da1) this.b;
        HandlerThread handlerThread = da1Var.e;
        handlerThread.start();
        da1Var.f = new Handler(handlerThread.getLooper());
        gl.e3(da1Var.e0, 0L);
        if (da1Var.e0()) {
            yla ylaVar = da1Var.E;
            if (ylaVar != null) {
                ylaVar.d();
                da1Var.E = null;
            }
            yla ylaVar2 = new yla(new ti4(0.0f));
            da1Var.E = ylaVar2;
            ylaVar2.b(new v91(da1Var, (byte) 0));
            da1Var.E.a(new zv0(da1Var, (byte) 3));
            da1Var.E.m = new zla(500.0f);
            da1Var.E.m.a(0.8f);
            da1Var.E.m.b(250.0f);
            da1Var.E.h();
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((Switch) this.b).invalidate();
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    public final jd1 r(mv6 mv6Var) {
        InputStream inputStream;
        kd1 kd1Var = (kd1) this.b;
        URL url = (URL) mv6Var.b;
        String c = xne.c("CctTransportBackend");
        if (Log.isLoggable(c, 4)) {
            Log.i(c, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) mv6Var.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                gi3 gi3Var = kd1Var.a;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                qu5 qu5Var = (qu5) gi3Var.a;
                wu5 wu5Var = new wu5(bufferedWriter, qu5Var.a, qu5Var.b, qu5Var.c, qu5Var.d);
                wu5Var.h((w70) mv6Var.c);
                wu5Var.j();
                wu5Var.b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Integer valueOf = Integer.valueOf(responseCode);
                String c2 = xne.c("CctTransportBackend");
                if (Log.isLoggable(c2, 4)) {
                    Log.i(c2, String.format("Status Code: %d", valueOf));
                }
                xne.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                xne.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new jd1(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        jd1 jd1Var = new jd1(responseCode, null, ca0.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return jd1Var;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new jd1(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e) {
            e = e;
            xne.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new jd1(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            xne.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new jd1(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            xne.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new jd1(400, null, 0L);
        } catch (t24 e4) {
            e = e4;
            xne.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new jd1(400, null, 0L);
        }
    }

    @Override
    public final void s(Canvas canvas, int i) {
        ((q11) this.b).dispatchDrawImplBlur(canvas, i);
    }

    @Override
    public final void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tg0 tg0Var = (tg0) obj;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    tg0Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                ((uy9) obj).run();
                return;
            case 4:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) obj;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    pt4.Z0(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 5:
                ((dt4) obj).run();
                return;
            case 6:
                ((uy9) obj).run();
                return;
            case 13:
                ((b87) obj).run();
                return;
            case 21:
                j61 j61Var = (j61) obj;
                i61 i61Var = new i61((byte) 0, j61Var.getContext(), false);
                i61Var.K();
                i61Var.c0 = false;
                i61Var.setCancelable(false);
                Context context = j61Var.getContext();
                st stVar = new st(context, (byte) 3);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624311, 150, 150, null);
                stVar.addView((View) imageView, nme.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                hn hnVar = new hn(context, false, true, true);
                stVar.b = hnVar;
                s33 s33Var = s33.g;
                hnVar.b(0.35f, 120L, s33Var);
                hnVar.setGravity(1);
                int i2 = bkb.i5;
                zkb.U(hnVar, i2, null);
                hnVar.setTextSize(gl.L(24.0f));
                hnVar.setTypeface(gl.o());
                stVar.addView(hnVar, nme.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.a = paint;
                Paint paint2 = new Paint(1);
                view.b = paint2;
                view.d = new lm(350L, (View) view, s33Var);
                int i3 = bkb.M6;
                paint.setColor(bkb.w0(null, i3, false));
                paint2.setColor(bkb.p1(0.2f, bkb.w0(null, i3, false)));
                stVar.c = view;
                stVar.addView((View) view, nme.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                tb4.w(textView, i2, null, 1, 16.0f);
                textView.setText(k96.M0(2131752034, null));
                stVar.addView(textView, nme.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                zkb.X(textView2, i2, null);
                ir2.r(14.0f, 1, 2131752033, textView2, null);
                stVar.addView(textView2, nme.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                stVar.e(0.0f);
                i61Var.O = stVar;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                s67 s67Var = new s67(j61Var, stVar, fArr, zArr2, (byte) 17);
                long[] jArr = {-1};
                gl.e3(new s67(j61Var, zArr, jArr, i61Var, (byte) 18), 150L);
                r61 r61Var = j61Var.d;
                p pVar = new p(fArr, zArr2, s67Var, (byte) 5);
                h61 h61Var = new h61(zArr, stVar, jArr, i61Var, (byte) 0);
                v61 v61Var = r61Var.e0;
                if (v61Var != null) {
                    v61Var.d();
                }
                d61 d61Var = r61Var.N;
                if (d61Var != null) {
                    d61Var.e();
                    r61Var.N.f(false);
                }
                r61Var.getFileLoader().c();
                r61Var.getFileLoader().getClass();
                ba4.K.c(new z51(r61Var, pVar, h61Var, (byte) 0));
                r61Var.e0 = null;
                d61 d61Var2 = r61Var.N;
                if (d61Var2 != null) {
                    d61Var2.setCacheModel(null);
                    return;
                }
                return;
            default:
                t7b t7bVar = ((j7b) ((rb1) obj)).S1;
                i7b i7bVar = t7bVar.Y0;
                if (i7bVar != null) {
                    i7bVar.s(null, null, true);
                }
                x6b x6bVar = t7bVar.w1;
                if (x6bVar != null) {
                    x6bVar.n0();
                }
                j7b j7bVar = t7bVar.d1;
                if (j7bVar != null) {
                    j7bVar.setHasRoundVideo(false);
                }
                f4b f4bVar = t7bVar.L1;
                if (f4bVar != null) {
                    File file = f4bVar.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        f4bVar = t7bVar.L1;
                        f4bVar.o0 = null;
                    }
                    if (f4bVar.p0 != null) {
                        try {
                            new File(t7bVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        t7bVar.L1.p0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void n() {
    }

    @Override
    public final void D(float f, int i) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
