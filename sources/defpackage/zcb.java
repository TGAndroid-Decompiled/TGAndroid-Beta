package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
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
import java.util.Set;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.Components.UndoView;
import org.webrtc.TextureViewRenderer;
public final class zcb implements Runnable {
    public final byte a;
    public final Object b;

    public zcb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        dw3[] dw3VarArr;
        gn[] gnVarArr;
        String[] F0;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i;
        int i2;
        long j;
        MediaCodec.BufferInfo bufferInfo;
        short s;
        boolean z2;
        byte b = this.a;
        int i3 = -1;
        int i4 = 8;
        boolean z3 = true;
        Bitmap bitmap = null;
        int i5 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                fdb fdbVar = (fdb) obj;
                int i6 = fdbVar.a;
                fdbVar.I = null;
                ddb ddbVar = fdbVar.c;
                if (ddbVar != null && ddbVar.getEditField() != null && fdbVar.c.getFieldText() != null) {
                    if (fdbVar.c.a()) {
                        fdbVar.s = false;
                        bdb bdbVar = fdbVar.d;
                        if (bdbVar != null) {
                            bdbVar.invalidate();
                            return;
                        }
                        return;
                    }
                    int selectionStart = fdbVar.c.getEditField().getSelectionStart();
                    int selectionEnd = fdbVar.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        fdbVar.s = false;
                        bdb bdbVar2 = fdbVar.d;
                        if (bdbVar2 != null) {
                            bdbVar2.invalidate();
                            return;
                        }
                        return;
                    }
                    CharSequence fieldText = fdbVar.c.getFieldText();
                    boolean z4 = fieldText instanceof Spanned;
                    if (z4) {
                        dw3VarArr = (dw3[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, dw3.class);
                    } else {
                        dw3VarArr = null;
                    }
                    if (dw3VarArr != null && dw3VarArr.length > 0 && gda.E && z8c.h(i6).p()) {
                        dw3 dw3Var = dw3VarArr[dw3VarArr.length - 1];
                        if (dw3Var != null) {
                            Spanned spanned = (Spanned) fieldText;
                            int spanStart = spanned.getSpanStart(dw3Var);
                            int spanEnd = spanned.getSpanEnd(dw3Var);
                            if (selectionStart == spanEnd) {
                                String substring = fieldText.toString().substring(spanStart, spanEnd);
                                fdbVar.s = true;
                                fdbVar.b();
                                fdbVar.W = dw3Var;
                                fdbVar.c0 = null;
                                fdbVar.b0 = null;
                                String str = fdbVar.K;
                                if (str != null && fdbVar.J == 2 && str.equals(substring) && !fdbVar.y && (arrayList2 = fdbVar.x) != null && !arrayList2.isEmpty()) {
                                    fdbVar.w = false;
                                    fdbVar.b();
                                    bdb bdbVar3 = fdbVar.d;
                                    if (bdbVar3 != null) {
                                        bdbVar3.setVisibility(0);
                                        fdbVar.d.invalidate();
                                    }
                                } else {
                                    int i7 = fdbVar.L + 1;
                                    fdbVar.L = i7;
                                    Runnable runnable = fdbVar.N;
                                    if (runnable != null) {
                                        gm.r(runnable);
                                    }
                                    fdbVar.N = new v99(fdbVar, substring, i7, (byte) 21);
                                    ArrayList arrayList3 = fdbVar.x;
                                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                                        fdbVar.N.run();
                                    } else {
                                        gm.d3(fdbVar.N, 600L);
                                    }
                                }
                                bdb bdbVar4 = fdbVar.d;
                                if (bdbVar4 != null) {
                                    bdbVar4.invalidate();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z4) {
                            gnVarArr = (gn[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, gn.class);
                        } else {
                            gnVarArr = null;
                        }
                        if ((gnVarArr == null || gnVarArr.length == 0) && selectionEnd < 52) {
                            fdbVar.s = true;
                            fdbVar.b();
                            fdbVar.W = null;
                            String substring2 = fieldText.toString().substring(0, selectionEnd);
                            String str2 = fdbVar.K;
                            if (str2 != null && fdbVar.J == 1 && str2.equals(substring2) && !fdbVar.y && (arrayList = fdbVar.x) != null && !arrayList.isEmpty()) {
                                fdbVar.w = false;
                                fdbVar.b();
                                fdbVar.d.setVisibility(0);
                                fdbVar.a0 = gm.L(10.0f);
                                fdbVar.d.invalidate();
                            } else {
                                int i8 = fdbVar.L + 1;
                                fdbVar.L = i8;
                                long currentTimeMillis = System.currentTimeMillis();
                                if (fdbVar.M != null && Math.abs(currentTimeMillis - fdbVar.O) <= 360) {
                                    fdbVar.O = currentTimeMillis;
                                    F0 = fdbVar.M;
                                } else {
                                    fdbVar.O = currentTimeMillis;
                                    F0 = gm.F0();
                                }
                                String[] strArr = fdbVar.M;
                                if (strArr == null || !Arrays.equals(F0, strArr)) {
                                    hs6.d0(i6).O(F0, false);
                                }
                                fdbVar.M = F0;
                                Runnable runnable2 = fdbVar.N;
                                if (runnable2 != null) {
                                    gm.r(runnable2);
                                    fdbVar.N = null;
                                }
                                fdbVar.N = new tda(fdbVar, F0, substring2, i8, (byte) 6);
                                ArrayList arrayList4 = fdbVar.x;
                                if (arrayList4 != null && !arrayList4.isEmpty()) {
                                    fdbVar.N.run();
                                } else {
                                    gm.d3(fdbVar.N, 600L);
                                }
                            }
                            bdb bdbVar5 = fdbVar.d;
                            if (bdbVar5 != null) {
                                bdbVar5.invalidate();
                                return;
                            }
                            return;
                        }
                    }
                    Runnable runnable3 = fdbVar.N;
                    if (runnable3 != null) {
                        gm.r(runnable3);
                        fdbVar.N = null;
                    }
                    fdbVar.s = false;
                    bdb bdbVar6 = fdbVar.d;
                    if (bdbVar6 != null) {
                        bdbVar6.invalidate();
                        return;
                    }
                    return;
                }
                fdbVar.s = false;
                fdbVar.w = true;
                bdb bdbVar7 = fdbVar.d;
                if (bdbVar7 != null) {
                    bdbVar7.invalidate();
                    return;
                }
                return;
            case 1:
                reb rebVar = (reb) obj;
                rebVar.L = null;
                rebVar.b();
                return;
            case 2:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
            case 3:
                yfb yfbVar = (yfb) obj;
                fja fjaVar = yfbVar.V;
                if (fjaVar != null && yfbVar.b0 != -1) {
                    fjaVar.a();
                    return;
                }
                return;
            case 4:
                iib iibVar = (iib) obj;
                mx6 mx6Var = iibVar.b;
                int i9 = z8c.t0;
                iibVar.c = i9;
                iibVar.d = gm.a1(oc7.r1(i9).W3, "auto_lastSelectedDialog", 0L);
                iibVar.e = false;
                iibVar.f = false;
                iibVar.g.clear();
                iibVar.h.b();
                iibVar.i.b();
                iibVar.j.b();
                iibVar.k.b();
                iibVar.l.b();
                try {
                    mx6Var.s0(null);
                    ((zw6) mx6Var.b).a.setQueueTitle(null);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                nm7.f(((hib) obj).g.c).k(151, 0);
                return;
            case 6:
                gm.E3(((xjb) obj).s0);
                return;
            case 7:
                skb skbVar = (skb) obj;
                skbVar.C.invalidate();
                skbVar.R();
                return;
            case 8:
                ((skb) ((nu3) obj).c).R();
                return;
            case 9:
                ((ukb) obj).a();
                return;
            case 10:
                ((TextureViewRenderer.TextureEglRenderer) obj).lambda$onFirstFrameRendered$0();
                return;
            case 11:
                ArrayList arrayList5 = ((glb) obj).a;
                for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                    ((View) arrayList5.get(i10)).setVisibility(8);
                    if (arrayList5.get(i10) instanceof rc2) {
                        ((rc2) arrayList5.get(i10)).m3(false, false);
                        ((rc2) arrayList5.get(i10)).o3(false, false, false);
                    }
                }
                return;
            case 12:
                Drawable drawable = (Drawable) obj;
                cmb.d = null;
                cmb.O();
                if (!cmb.b) {
                    cmb.i(drawable);
                    cmb.g(drawable);
                }
                nm7.e().k(281, new Object[0]);
                return;
            case 13:
                uob uobVar = (uob) obj;
                uobVar.y = -1;
                while (true) {
                    rc2[] rc2VarArr = uobVar.n;
                    if (i5 < rc2VarArr.length) {
                        rc2 rc2Var = rc2VarArr[i5];
                        if (rc2Var != null) {
                            rc2Var.invalidate();
                        }
                        i5++;
                    } else {
                        return;
                    }
                }
            case 14:
                bpb bpbVar = (bpb) obj;
                bpbVar.K = null;
                bpbVar.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                return;
            case 15:
                eqb eqbVar = (eqb) obj;
                try {
                    int round = Math.round((((float) (eqbVar.h * eqbVar.g.getInteger("sample-rate"))) / eqbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(eqbVar.g.getString("mime"));
                    if (createDecoderByType != null) {
                        createDecoderByType.configure(eqbVar.g, (Surface) null, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        createDecoderByType.getInputBuffers();
                        createDecoderByType.getOutputBuffers();
                        short[] sArr = new short[32];
                        int i11 = -1;
                        boolean z5 = false;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        short s2 = 0;
                        while (true) {
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer >= 0) {
                                int readSampleData = eqbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                if (readSampleData < 0) {
                                    z = z3;
                                    i2 = i12;
                                    j = 2500;
                                    try {
                                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                        i = i4;
                                        bufferInfo = bufferInfo2;
                                        z5 = z;
                                    } catch (Exception e) {
                                        e = e;
                                        fc4.g(e, z);
                                        return;
                                    }
                                } else {
                                    z = z3;
                                    i2 = i12;
                                    j = 2500;
                                    i = i4;
                                    bufferInfo = bufferInfo2;
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, eqbVar.f.getSampleTime(), 0);
                                    eqbVar.f.advance();
                                }
                            } else {
                                i = i4;
                                z = z3;
                                i2 = i12;
                                j = 2500;
                                bufferInfo = bufferInfo2;
                            }
                            if (i11 >= 0) {
                                createDecoderByType.getOutputBuffer(i11).position(0);
                            }
                            i11 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                            int i15 = i2;
                            while (true) {
                                if (i11 != i3 && !z5) {
                                    if (i11 >= 0) {
                                        ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i11);
                                        if (outputBuffer != null && bufferInfo.size > 0) {
                                            int i16 = i14;
                                            while (outputBuffer.remaining() > 0) {
                                                short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                                if (i16 >= round) {
                                                    sArr[i15 - i13] = s2;
                                                    i15++;
                                                    int i17 = i15 - i13;
                                                    if (i17 >= sArr.length || i15 >= eqbVar.b) {
                                                        gm.c3(new v99(eqbVar, sArr, i17, (byte) 25));
                                                        i13 = i15;
                                                        sArr = new short[sArr.length];
                                                    }
                                                    if (i15 >= eqbVar.d.length) {
                                                        i14 = 0;
                                                        s2 = 0;
                                                    } else {
                                                        s = 0;
                                                        i16 = 0;
                                                    }
                                                } else {
                                                    s = s2;
                                                }
                                                if (s < s3) {
                                                    s2 = s3;
                                                } else {
                                                    s2 = s;
                                                }
                                                i16++;
                                                int i18 = i;
                                                if (outputBuffer.remaining() >= i18) {
                                                    outputBuffer.position(outputBuffer.position() + i18);
                                                    i = 8;
                                                } else {
                                                    i14 = i16;
                                                }
                                            }
                                            i14 = i16;
                                        }
                                        createDecoderByType.releaseOutputBuffer(i11, false);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            z5 = z;
                                        }
                                    } else if (i11 == -3) {
                                        createDecoderByType.getOutputBuffers();
                                    }
                                    i11 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                    i3 = -1;
                                    i = 8;
                                }
                            }
                            i12 = i15;
                            synchronized (eqbVar.i) {
                                if (!eqbVar.j) {
                                    if (!z5 && i12 < eqbVar.b) {
                                        z3 = z;
                                        i3 = -1;
                                        i4 = 8;
                                    }
                                }
                            }
                        }
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        eqbVar.f.release();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z = z3;
                }
                break;
            case 16:
                gqb gqbVar = (gqb) obj;
                jqb jqbVar = gqbVar.c;
                if (jqbVar != null) {
                    long j2 = jqbVar.a;
                    if (j2 > 0) {
                        gqbVar.e = j2;
                        gqbVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                jqb jqbVar2 = (jqb) obj;
                MediaMetadataRetriever mediaMetadataRetriever = jqbVar2.e;
                if (mediaMetadataRetriever != null) {
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(jqbVar2.j * 1000, 2);
                        if (bitmap != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(jqbVar2.f, jqbVar2.g, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            float max = Math.max(jqbVar2.f / bitmap.getWidth(), jqbVar2.g / bitmap.getHeight());
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Rect rect2 = new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) (((bitmap.getWidth() * max) + createBitmap.getWidth()) / 2.0f), (int) (((bitmap.getHeight() * max) + createBitmap.getHeight()) / 2.0f));
                            if (jqbVar2.h) {
                                Path path = jqbVar2.m;
                                if (path == null) {
                                    path = new Path();
                                    jqbVar2.m = path;
                                }
                                path.rewind();
                                jqbVar2.m.addCircle(jqbVar2.f / 2.0f, jqbVar2.g / 2.0f, Math.min(jqbVar2.f, jqbVar2.g) / 2.0f, Path.Direction.CW);
                                canvas.clipPath(jqbVar2.m);
                            }
                            canvas.drawBitmap(bitmap, rect, rect2, jqbVar2.l);
                            bitmap.recycle();
                            bitmap = createBitmap;
                        }
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                    gm.c3(new b7b(jqbVar2, bitmap, (byte) 15));
                    return;
                }
                return;
            case 18:
                kvb kvbVar = (kvb) obj;
                ViewPropertyAnimator duration = kvbVar.animate().alpha(0.0f).setListener(new q7b(kvbVar, (byte) 6)).setDuration(300L);
                kvbVar.b = duration;
                duration.start();
                return;
            case 19:
                awb awbVar = (awb) obj;
                qac qacVar = awbVar.b;
                if (qacVar != null) {
                    qacVar.a(Long.valueOf(awbVar.a.t));
                    return;
                }
                return;
            case 20:
                ((uwb) obj).J.r.f();
                return;
            case 21:
                ((cxb) obj).b.D0();
                return;
            case 22:
                mzb mzbVar = (mzb) ((sw9) obj).c;
                if (mzbVar.i()) {
                    mzbVar.j();
                    return;
                }
                return;
            case 23:
                ((b2c) obj).c.setVisibility(8);
                return;
            case 24:
                ((zs1) obj).c.presentFragment(new qc9());
                return;
            case 25:
                b3c b3cVar = (b3c) obj;
                oc7 oc7Var = b3cVar.n;
                String string = oc7Var.X3.getString("translating_dialog_languages2", null);
                if (string != null) {
                    for (String str3 : string.split(";")) {
                        String[] split = str3.split("=");
                        if (split.length >= 2) {
                            long parseLong = Long.parseLong(split[0]);
                            String[] split2 = split[1].split(">");
                            if (split2.length == 2) {
                                String str4 = split2[0];
                                String str5 = split2[1];
                                if (str5.length() > 0 && str5.charAt(str5.length() - 1) == '!') {
                                    str5 = ts2.m(1, 0, str5);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ("null".equals(str4)) {
                                    str4 = null;
                                }
                                if ("null".equals(str5)) {
                                    str5 = null;
                                }
                                if (str4 != null) {
                                    b3cVar.e.put(Long.valueOf(parseLong), str4);
                                    if (!b3cVar.v(str4)) {
                                        b3cVar.a.put(parseLong, Boolean.valueOf(!z2));
                                        b3cVar.b.add(Long.valueOf(parseLong));
                                    }
                                    if (str5 != null) {
                                        b3cVar.d.put(Long.valueOf(parseLong), str5);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = oc7Var.X3.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str6 : stringSet) {
                            try {
                                b3cVar.h.add(Long.valueOf(Long.parseLong(str6)));
                            } catch (Exception e4) {
                                fc4.g(e4, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((o3c) obj).requestLayout();
                return;
            case 27:
                ((a6c) obj).f();
                return;
            case 28:
                a7c a7cVar = ((b7c) obj).a;
                if (a7cVar != null) {
                    a7cVar.h();
                    return;
                }
                return;
            default:
                UndoView undoView = (UndoView) obj;
                int i19 = UndoView.j0;
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
