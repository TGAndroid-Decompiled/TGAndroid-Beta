package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.text.Spanned;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLParseException;
public final class s8b implements Runnable {
    public final byte a;
    public final Object b;

    public s8b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        int i;
        mv3[] mv3VarArr;
        hm[] hmVarArr;
        String[] F0;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        long j;
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        short s;
        int i3 = -1;
        Bitmap bitmap = null;
        boolean z3 = true;
        int i4 = 0;
        switch (this.a) {
            case 0:
                t8b t8bVar = (t8b) this.b;
                if (t8bVar.w) {
                    t8bVar.F = true;
                    t8bVar.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    t8bVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    t8bVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    t8bVar.invalidate();
                    return;
                }
                return;
            case 1:
                c51 c51Var = (c51) this.b;
                if (c51Var != null) {
                    c51Var.setLoading(false);
                    return;
                }
                return;
            case 2:
                ((t9b) ((a3a) this.b).n).fullScroll(130);
                return;
            case 3:
                rbb rbbVar = (rbb) this.b;
                rbbVar.h0.onTouchEvent(hl.R());
                rbbVar.g0.E(hl.R());
                return;
            case 4:
                sbb sbbVar = (sbb) ((zt4) this.b).m0;
                sbbVar.t(true);
                sbbVar.B0.setCameraThumb(sbbVar.y());
                return;
            case 5:
                xab xabVar = (xab) this.b;
                sbb sbbVar2 = xabVar.c0;
                if (!sbbVar2.R1 && !sbbVar2.Q1 && sbbVar2.C0 != null && sbbVar2.g0 == 0 && sbbVar2.n1 != null) {
                    if (xabVar.isFrontface()) {
                        i = 2131744367;
                    } else {
                        i = 2131744366;
                    }
                    String M0 = ob6.M0(i, null);
                    kg5 kg5Var = sbbVar2.n1;
                    kg5Var.h = kg5.a(M0, kg5Var.getTextPaint());
                    sbbVar2.n1.t(M0);
                    sbbVar2.n1.v();
                    uc7.e1().edit().putInt("storysvddualhint", uc7.e1().getInt("storysvddualhint", 0) + 1).apply();
                    return;
                }
                return;
            case 6:
                ((de0) this.b).setVisibility(8);
                return;
            case 7:
                lcb lcbVar = ((ubb) this.b).b;
                try {
                    zbb zbbVar = lcbVar.s;
                    if (zbbVar != null) {
                        if (lcbVar.b) {
                            hl.B2(zbbVar);
                        } else {
                            lcbVar.n.removeView(zbbVar);
                        }
                        lcbVar.s = null;
                        lcbVar.q();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 8:
                ((zbb) this.b).s0.O(true);
                return;
            case 9:
                zeb zebVar = (zeb) this.b;
                int i5 = zebVar.a;
                zebVar.I = null;
                xeb xebVar = zebVar.c;
                if (xebVar != null && xebVar.getEditField() != null && zebVar.c.getFieldText() != null) {
                    if (zebVar.c.a()) {
                        zebVar.s = false;
                        h8b h8bVar = zebVar.d;
                        if (h8bVar != null) {
                            h8bVar.invalidate();
                            return;
                        }
                        return;
                    }
                    int selectionStart = zebVar.c.getEditField().getSelectionStart();
                    int selectionEnd = zebVar.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        zebVar.s = false;
                        h8b h8bVar2 = zebVar.d;
                        if (h8bVar2 != null) {
                            h8bVar2.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = zebVar.c.getFieldText();
                    boolean z4 = fieldText instanceof Spanned;
                    if (z4) {
                        mv3VarArr = (mv3[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, mv3.class);
                    } else {
                        mv3VarArr = null;
                    }
                    if (mv3VarArr != null && mv3VarArr.length > 0 && xea.E && yac.h(i5).p()) {
                        mv3 mv3Var = mv3VarArr[mv3VarArr.length - 1];
                        if (mv3Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(mv3Var);
                            int spanEnd = spanned.getSpanEnd(mv3Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                zebVar.s = true;
                                zebVar.b();
                                zebVar.W = mv3Var;
                                zebVar.c0 = null;
                                zebVar.b0 = null;
                                String str = zebVar.K;
                                if (str != null && zebVar.J == 2 && str.equals(substring) && !zebVar.y && (arrayList2 = zebVar.x) != null && !arrayList2.isEmpty()) {
                                    zebVar.w = false;
                                    zebVar.b();
                                    h8b h8bVar3 = zebVar.d;
                                    if (h8bVar3 != null) {
                                        h8bVar3.setVisibility(0);
                                        zebVar.d.invalidate();
                                    }
                                } else {
                                    int i6 = zebVar.L + 1;
                                    zebVar.L = i6;
                                    Runnable runnable = zebVar.N;
                                    if (runnable != null) {
                                        hl.r(runnable);
                                    }
                                    zebVar.N = new a39(zebVar, substring, i6, (byte) 22);
                                    ArrayList arrayList3 = zebVar.x;
                                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                                        zebVar.N.run();
                                    } else {
                                        hl.d3(zebVar.N, 600L);
                                    }
                                }
                                h8b h8bVar4 = zebVar.d;
                                if (h8bVar4 != null) {
                                    h8bVar4.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z4) {
                            hmVarArr = (hm[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, hm.class);
                        } else {
                            hmVarArr = null;
                        }
                        if ((hmVarArr == null || hmVarArr.length == 0) && selectionEnd < 52) {
                            zebVar.s = true;
                            zebVar.b();
                            zebVar.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            String str2 = zebVar.K;
                            if (str2 != null && zebVar.J == 1 && str2.equals(substring2) && !zebVar.y && (arrayList = zebVar.x) != null && !arrayList.isEmpty()) {
                                zebVar.w = false;
                                zebVar.b();
                                zebVar.d.setVisibility(0);
                                zebVar.a0 = hl.L(10.0f);
                                zebVar.d.invalidate();
                            } else {
                                int i7 = zebVar.L + 1;
                                zebVar.L = i7;
                                long currentTimeMillis = System.currentTimeMillis();
                                if (zebVar.M != null && Math.abs(currentTimeMillis - zebVar.O) <= 360) {
                                    zebVar.O = currentTimeMillis;
                                    F0 = zebVar.M;
                                } else {
                                    zebVar.O = currentTimeMillis;
                                    F0 = hl.F0();
                                }
                                String[] strArr = zebVar.M;
                                if (strArr == null || !Arrays.equals(F0, strArr)) {
                                    ls6.d0(i5).O(F0, false);
                                }
                                zebVar.M = F0;
                                Runnable runnable2 = zebVar.N;
                                if (runnable2 != null) {
                                    hl.r(runnable2);
                                    zebVar.N = null;
                                }
                                zebVar.N = new efa(zebVar, F0, substring2, i7, (byte) 7);
                                ArrayList arrayList4 = zebVar.x;
                                if (arrayList4 != null && !arrayList4.isEmpty()) {
                                    zebVar.N.run();
                                } else {
                                    hl.d3(zebVar.N, 600L);
                                }
                            }
                            h8b h8bVar5 = zebVar.d;
                            if (h8bVar5 != null) {
                                h8bVar5.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = zebVar.N;
                    if (runnable3 != null) {
                        hl.r(runnable3);
                        zebVar.N = null;
                    }
                    zebVar.s = false;
                    h8b h8bVar6 = zebVar.d;
                    if (h8bVar6 != null) {
                        h8bVar6.invalidate();
                        return;
                    }
                    return;
                }
                zebVar.s = false;
                zebVar.w = true;
                h8b h8bVar7 = zebVar.d;
                if (h8bVar7 != null) {
                    h8bVar7.invalidate();
                    return;
                }
                return;
            case 10:
                lgb lgbVar = (lgb) this.b;
                lgbVar.L = null;
                lgbVar.b();
                return;
            case 11:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                return;
            case 12:
                thb thbVar = (thb) this.b;
                wka wkaVar = thbVar.V;
                if (wkaVar != null && thbVar.b0 != -1) {
                    wkaVar.a();
                    return;
                }
                return;
            case 13:
                dkb dkbVar = (dkb) this.b;
                rx6 rx6Var = dkbVar.b;
                int i8 = yac.t0;
                dkbVar.c = i8;
                dkbVar.d = hl.a1(uc7.s1(i8).X3, "auto_lastSelectedDialog", 0L);
                dkbVar.e = false;
                dkbVar.f = false;
                dkbVar.g.clear();
                dkbVar.h.b();
                dkbVar.i.b();
                dkbVar.j.b();
                dkbVar.k.b();
                dkbVar.l.b();
                try {
                    rx6Var.t0(null);
                    ((ex6) rx6Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 14:
                jn7.f(((ckb) this.b).g.c).k(151, 0);
                return;
            case 15:
                hl.E3(((rlb) this.b).s0);
                return;
            case 16:
                mmb mmbVar = (mmb) this.b;
                mmbVar.C.invalidate();
                mmbVar.R();
                return;
            case 17:
                ((mmb) ((ut3) this.b).c).R();
                return;
            case 18:
                ((pmb) this.b).a();
                return;
            case 19:
                anb anbVar = (anb) this.b;
                anbVar.P = true;
                anbVar.M.onFirstFrameRendered();
                return;
            case 20:
                ArrayList arrayList5 = ((enb) this.b).a;
                for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                    ((View) arrayList5.get(i9)).setVisibility(8);
                    if (arrayList5.get(i9) instanceof wb2) {
                        ((wb2) arrayList5.get(i9)).m3(false, false);
                        ((wb2) arrayList5.get(i9)).o3(false, false, false);
                    }
                }
                return;
            case 21:
                Drawable drawable = (Drawable) this.b;
                aob.d = null;
                aob.O();
                if (!aob.b) {
                    aob.i(drawable);
                    aob.g(drawable);
                }
                jn7.e().k(280, new Object[0]);
                return;
            case 22:
                sqb sqbVar = (sqb) this.b;
                sqbVar.y = -1;
                while (true) {
                    wb2[] wb2VarArr = sqbVar.n;
                    if (i4 < wb2VarArr.length) {
                        wb2 wb2Var = wb2VarArr[i4];
                        if (wb2Var != null) {
                            wb2Var.invalidate();
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
            case 23:
                zqb zqbVar = (zqb) this.b;
                zqbVar.K = null;
                zqbVar.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                return;
            case 24:
                dsb dsbVar = (dsb) this.b;
                try {
                    int round = Math.round((((float) (dsbVar.h * dsbVar.g.getInteger("sample-rate"))) / dsbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(dsbVar.g.getString("mime"));
                    if (createDecoderByType != null) {
                        createDecoderByType.configure(dsbVar.g, (Surface) null, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        createDecoderByType.getInputBuffers();
                        createDecoderByType.getOutputBuffers();
                        short[] sArr = new short[32];
                        int i10 = -1;
                        boolean z5 = false;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = 0;
                        short s2 = 0;
                        while (true) {
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer >= 0) {
                                int readSampleData = dsbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                if (readSampleData < 0) {
                                    j = 2500;
                                    i2 = 8;
                                    try {
                                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                        z = z3;
                                        bufferInfo = bufferInfo2;
                                        z5 = z;
                                    } catch (Exception e) {
                                        e = e;
                                        z2 = z3;
                                        cc4.g(e, z2);
                                        return;
                                    }
                                } else {
                                    j = 2500;
                                    i2 = 8;
                                    z = z3;
                                    bufferInfo = bufferInfo2;
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, dsbVar.f.getSampleTime(), 0);
                                    dsbVar.f.advance();
                                }
                            } else {
                                z = z3;
                                j = 2500;
                                bufferInfo = bufferInfo2;
                                i2 = 8;
                            }
                            if (i10 >= 0) {
                                try {
                                    createDecoderByType.getOutputBuffer(i10).position(0);
                                } catch (Exception e2) {
                                    e = e2;
                                    z2 = z;
                                    cc4.g(e, z2);
                                    return;
                                }
                            }
                            i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                            while (true) {
                                if (i10 != i3 && !z5) {
                                    if (i10 >= 0) {
                                        ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i10);
                                        if (outputBuffer != null && bufferInfo.size > 0) {
                                            int i14 = i13;
                                            while (outputBuffer.remaining() > 0) {
                                                short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                                if (i14 >= round) {
                                                    sArr[i11 - i12] = s2;
                                                    i11++;
                                                    int i15 = i11 - i12;
                                                    if (i15 >= sArr.length || i11 >= dsbVar.b) {
                                                        hl.c3(new a39(dsbVar, sArr, i15, (byte) 26));
                                                        i12 = i11;
                                                        sArr = new short[sArr.length];
                                                    }
                                                    if (i11 >= dsbVar.d.length) {
                                                        i13 = 0;
                                                        s2 = 0;
                                                    } else {
                                                        s = 0;
                                                        i14 = 0;
                                                    }
                                                } else {
                                                    s = s2;
                                                }
                                                if (s < s3) {
                                                    s2 = s3;
                                                } else {
                                                    s2 = s;
                                                }
                                                i14++;
                                                int i16 = i2;
                                                if (outputBuffer.remaining() >= i16) {
                                                    outputBuffer.position(outputBuffer.position() + i16);
                                                    i2 = 8;
                                                } else {
                                                    i13 = i14;
                                                }
                                            }
                                            i13 = i14;
                                        }
                                        createDecoderByType.releaseOutputBuffer(i10, false);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            z5 = z;
                                        }
                                    } else if (i10 == -3) {
                                        createDecoderByType.getOutputBuffers();
                                    }
                                    i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                    i3 = -1;
                                    i2 = 8;
                                }
                            }
                            synchronized (dsbVar.i) {
                                if (!dsbVar.j) {
                                    if (!z5 && i11 < dsbVar.b) {
                                        z3 = z;
                                        i3 = -1;
                                    }
                                }
                            }
                        }
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        dsbVar.f.release();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    e = e3;
                    z = z3;
                }
                break;
            case 25:
                fsb fsbVar = (fsb) this.b;
                isb isbVar = fsbVar.c;
                if (isbVar != null) {
                    long j2 = isbVar.a;
                    if (j2 > 0) {
                        fsbVar.e = j2;
                        fsbVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                isb isbVar2 = (isb) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = isbVar2.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(isbVar2.j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(isbVar2.f, isbVar2.g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(isbVar2.f / bitmap.getWidth(), isbVar2.g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) (((bitmap.getWidth() * max) + createBitmap.getWidth()) / 2.0f), (int) (((bitmap.getHeight() * max) + createBitmap.getHeight()) / 2.0f));
                            if (isbVar2.h) {
                                Path path = isbVar2.m;
                                if (path == null) {
                                    path = new Path();
                                    isbVar2.m = path;
                                }
                                path.rewind();
                                isbVar2.m.addCircle(isbVar2.f / 2.0f, isbVar2.g / 2.0f, Math.min(isbVar2.f, isbVar2.g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(isbVar2.m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, isbVar2.l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                    hl.c3(new hab(isbVar2, bitmap, (byte) 11));
                    return;
                }
                return;
            case 27:
                kxb kxbVar = (kxb) this.b;
                ViewPropertyAnimator duration = kxbVar.animate().alpha(0.0f).setListener(new omb(kxbVar, (byte) 3)).setDuration(300L);
                kxbVar.b = duration;
                duration.start();
                return;
            case 28:
                ayb aybVar = (ayb) this.b;
                pcc pccVar = aybVar.b;
                if (pccVar != null) {
                    pccVar.a(Long.valueOf(aybVar.a.t));
                    return;
                }
                return;
            default:
                ((uyb) this.b).J.r.f();
                return;
        }
    }
}
