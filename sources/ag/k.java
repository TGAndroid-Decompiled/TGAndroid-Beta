package ag;

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
public final class k {
    public static final String[] f215a0 = {"models/star.binobj"};
    public static final String[] f216b0 = {"models/diamond_outer_2.binobj", "models/diamond_outer.binobj", "models/diamond.binobj"};
    public static final String[] f217c0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] f218d0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
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
    public final int f219a;
    public final int f220b;
    public final int f221c;
    public final FloatBuffer[] d;
    public final FloatBuffer[] f222e;
    public final FloatBuffer[] f223f;
    public final int f224g;
    public final int h;
    public final int f225i;
    public final int f226j;
    public final int f227k;
    public final int f228l;
    public final int f229m;
    public final int f230n;
    public final int f231o;
    public final int f232p;
    public final int f233q;
    public final int f234r;
    public float f235s;
    public final int[] f236t;
    public int f240y;
    public int f241z;
    public float f237u = 0.0f;
    public float v = 2.0f;
    public float f238w = 0.13f;
    public float f239x = 1.0f;
    public float A = 0.2f;
    public int B = -1;
    public int C = -1;
    public float Z = 0.0f;

    public k(android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: ag.k.<init>(android.content.Context, int):void");
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

    public final void a(int i9, boolean z10) {
        int i10 = i9 * 3;
        GLES20.glBindBuffer(34962, this.Y[i10]);
        GLES20.glVertexAttribPointer(this.f228l, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i10 + 1]);
        GLES20.glVertexAttribPointer(this.f229m, 3, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i10 + 2]);
        GLES20.glVertexAttribPointer(this.f227k, 3, 5126, false, 0, 0);
        GLES20.glUniform1i(this.O, i9);
        GLES20.glUniform1i(this.P, i9);
        GLES20.glUniform1i(this.Q, z10 ? 1 : 0);
        GLES20.glUniform1i(this.R, this.X);
        GLES20.glDrawArrays(4, 0, this.f236t[i9] / 3);
    }
}
