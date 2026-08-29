package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j {
    public static final String[] f5600a0 = {"models/star.binobj"};
    public static final String[] f5601b0 = {"models/diamond_outer_2.binobj", "models/diamond_outer.binobj", "models/diamond.binobj"};
    public static final String[] f5602c0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f5603d0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final Bitmap U;
    public Bitmap V;
    public final int W;
    public final int X;
    public final int[] Y;
    public final int f5604a;
    public final int f5605b;
    public final int f5606c;
    public final FloatBuffer[] d;
    public final FloatBuffer[] f5607e;
    public final FloatBuffer[] f5608f;
    public final int f5609g;
    public final int h;
    public final int f5610i;
    public final int f5611j;
    public final int f5612k;
    public final int f5613l;
    public final int f5614m;
    public final int f5615n;
    public final int f5616o;
    public final int f5617p;
    public final int f5618q;
    public final int f5619r;
    public float f5620s;
    public final int[] f5621t;
    public int f5625y;
    public int f5626z;
    public float f5622u = 0.0f;
    public float v = 2.0f;
    public float f5623w = 0.13f;
    public float f5624x = 1.0f;
    public float A = 0.2f;
    public int B = -1;
    public int C = -1;
    public float Z = 0.0f;

    public j(android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: dg.j.<init>(android.content.Context, int):void");
    }

    public static String b(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
            bufferedReader.close();
            open.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public static String c(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(Integer.parseInt(group.substring(0, 2), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(2, 4), 16) / 255.0d), Double.valueOf(Integer.parseInt(group.substring(4, 6), 16) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void a(int i10, boolean z10) {
        int i11 = i10 * 3;
        GLES20.glBindBuffer(34962, this.Y[i11]);
        GLES20.glVertexAttribPointer(this.f5613l, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 1]);
        GLES20.glVertexAttribPointer(this.f5614m, 3, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 2]);
        GLES20.glVertexAttribPointer(this.f5612k, 3, 5126, false, 0, 0);
        GLES20.glUniform1i(this.O, i10);
        GLES20.glUniform1i(this.P, i10);
        GLES20.glUniform1i(this.Q, z10 ? 1 : 0);
        GLES20.glUniform1i(this.R, this.X);
        GLES20.glDrawArrays(4, 0, this.f5621t[i10] / 3);
    }
}
