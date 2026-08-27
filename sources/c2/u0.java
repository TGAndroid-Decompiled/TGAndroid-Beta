package c2;

import android.content.DialogInterface;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import lh.z7;
import m.i3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.y40;

public final class u0 extends Handler {

    public final int f2351a;

    public WeakReference f2352b;

    public u0(int i10) {
        this.f2351a = i10;
    }

    @Override
    public final void handleMessage(Message message) {
        p pVar;
        a1.c cVar;
        r rVar;
        e eVar;
        boolean z10;
        long j10;
        long j11;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        long j12;
        long j13;
        long j14;
        s0 s0Var = null;
        s0 s0Var2 = null;
        int i14 = 2;
        switch (this.f2351a) {
            case 0:
                r0 r0Var = (r0) this.f2352b.get();
                if (r0Var != null) {
                    SparseArray sparseArray = r0Var.h;
                    y0 y0Var = r0Var.f2338i;
                    ArrayList arrayList = y0Var.v;
                    int i15 = message.what;
                    int i16 = message.arg1;
                    int i17 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    switch (i15) {
                        case 0:
                            if (i16 == r0Var.f2337g) {
                                r0Var.f2337g = 0;
                                if (y0Var.f2389y == r0Var) {
                                    y0Var.q();
                                }
                            }
                            if (((v0) sparseArray.get(i16)) != null) {
                                sparseArray.remove(i16);
                                v0.a(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (r0Var.f2336f == 0 && i16 == r0Var.f2337g && i17 >= 1) {
                                    r0Var.f2337g = 0;
                                    r0Var.f2336f = i17;
                                    t tVarF = t.f(bundle);
                                    if (y0Var.f2389y == r0Var) {
                                        y0Var.g(tVarF);
                                    }
                                    if (y0Var.f2389y == r0Var) {
                                        y0Var.A = true;
                                        int size = arrayList.size();
                                        for (int i18 = 0; i18 < size; i18++) {
                                            ((s0) arrayList.get(i18)).a(y0Var.f2389y);
                                        }
                                        o oVar = (o) y0Var.h;
                                        if (oVar != null) {
                                            r0 r0Var2 = y0Var.f2389y;
                                            int i19 = r0Var2.d;
                                            r0Var2.d = i19 + 1;
                                            r0Var2.b(10, i19, 0, oVar.f2315a, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                v0 v0Var = (v0) sparseArray.get(i16);
                                if (v0Var != null) {
                                    sparseArray.remove(i16);
                                    v0Var.b(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((v0) sparseArray.get(i16)) != null) {
                                    sparseArray.remove(i16);
                                    v0.a(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (r0Var.f2336f != 0) {
                                    t tVarF2 = t.f(bundle4);
                                    if (y0Var.f2389y == r0Var) {
                                        y0Var.g(tVarF2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                v0 v0Var2 = (v0) sparseArray.get(i16);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i16);
                                    v0Var2.b(bundle5);
                                } else {
                                    v0Var2.getClass();
                                    v0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (r0Var.f2336f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    n nVar = bundle7 != null ? new n(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i20 = 0;
                                    while (i20 < size2) {
                                        Object obj2 = parcelableArrayList.get(i20);
                                        i20++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            pVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            pVar = new p(bundle9 != null ? new n(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(pVar);
                                    }
                                    if (y0Var.f2389y == r0Var) {
                                        int size3 = arrayList.size();
                                        int i21 = 0;
                                        while (i21 < size3) {
                                            Object obj3 = arrayList.get(i21);
                                            i21++;
                                            s0 s0Var3 = (s0) obj3;
                                            if (s0Var3.b() == i17) {
                                                s0Var2 = s0Var3;
                                                if (s0Var2 instanceof w0) {
                                                    ((w0) s0Var2).l(nVar, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (s0Var2 instanceof w0) {
                                            ((w0) s0Var2).l(nVar, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (y0Var.f2389y == r0Var) {
                                int size4 = arrayList.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj4 = arrayList.get(i22);
                                    i22++;
                                    s0 s0Var4 = (s0) obj4;
                                    if (s0Var4.b() == i17) {
                                        s0Var = s0Var4;
                                        cVar = y0Var.B;
                                        if (cVar != null && (s0Var instanceof r)) {
                                            rVar = (r) s0Var;
                                            eVar = (e) ((z0) cVar.f35b).f2412c;
                                            if (eVar.f2254e == rVar) {
                                                eVar.i(eVar.c(), 2);
                                            }
                                        }
                                        arrayList.remove(s0Var);
                                        s0Var.c();
                                        y0Var.r();
                                        break;
                                    }
                                }
                                cVar = y0Var.B;
                                if (cVar != null) {
                                    rVar = (r) s0Var;
                                    eVar = (e) ((z0) cVar.f35b).f2412c;
                                    if (eVar.f2254e == rVar) {
                                        eVar.i(eVar.c(), 2);
                                    }
                                }
                                arrayList.remove(s0Var);
                                s0Var.c();
                                y0Var.r();
                            }
                            break;
                    }
                    int i23 = y0.C;
                }
                break;
            case 1:
                int i24 = message.what;
                if (i24 == -3 || i24 == -2 || i24 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2352b.get(), message.what);
                    break;
                } else if (i24 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                int i25 = message.what;
                j50 j50Var = (j50) this.f2352b.get();
                if (j50Var != null) {
                    if (i25 == 0) {
                        try {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera start encoder");
                            }
                            j50.a(j50Var, message.arg1 == 1);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            j50.b(j50Var, 0, null);
                            Looper.myLooper().quit();
                        }
                        break;
                    } else if (i25 == 1) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("InstantCamera stop encoder");
                        }
                        j50.b(j50Var, message.arg1, (e50) message.obj);
                        break;
                    } else {
                        long j15 = 0;
                        long j16 = -1;
                        if (i25 == 2) {
                            long j17 = (((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L);
                            Integer num = (Integer) message.obj;
                            if (!j50Var.f29629z0 && j50Var.D0.N) {
                                try {
                                    j50Var.e(false);
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                if (j50Var.f29619s0.equals(num)) {
                                    z10 = false;
                                } else {
                                    j50Var.f29619s0 = num;
                                    z10 = true;
                                }
                                long j18 = j50Var.f29599c0;
                                if (j18 >= 0) {
                                    if (j50Var.f29597b0 == -1) {
                                        j50Var.f29597b0 = j17 - j18;
                                    }
                                    j17 -= j50Var.f29597b0;
                                }
                                if (z10) {
                                    if (j50Var.N != 0) {
                                        j10 = 0;
                                    } else {
                                        j10 = 0;
                                    }
                                    j50Var.O = j17;
                                    j11 = 0;
                                } else {
                                    long j19 = j50Var.O;
                                    if (j19 == -1) {
                                        if (j50Var.N != 0 || j50Var.M) {
                                            j10 = 0;
                                        } else {
                                            j10 = j17 - j50Var.O;
                                            long jCurrentTimeMillis = (System.currentTimeMillis() - j50Var.K) * 1000000;
                                            if (j10 < 0 || Math.abs(jCurrentTimeMillis - j10) > 100000000) {
                                                j10 = jCurrentTimeMillis;
                                            }
                                            if (j10 < 0) {
                                                j10 = 0;
                                            }
                                        }
                                        j50Var.O = j17;
                                        j11 = 0;
                                    } else {
                                        j10 = j17 - j19;
                                        j50Var.O = j17;
                                        j11 = j10;
                                    }
                                }
                                j50Var.M = false;
                                j50Var.K = System.currentTimeMillis();
                                if (!j50Var.W) {
                                    long j20 = j50Var.V + j10;
                                    j50Var.V = j20;
                                    if (j20 >= 200000000) {
                                        j50Var.W = true;
                                    }
                                }
                                j50Var.N += j10;
                                if (j50Var.Y == -1) {
                                    j50Var.Y = j17 / 1000;
                                    if (BuildVars.LOGS_ENABLED) {
                                        i0.a.y(new StringBuilder("InstantCamera first video frame was at "), j50Var.Y);
                                    }
                                }
                                j50Var.f29595a0 = j17 - j50Var.Z;
                                j50Var.Z = j17;
                                k50 k50Var = j50Var.D0;
                                FloatBuffer floatBuffer = k50Var.f29995v0;
                                FloatBuffer floatBuffer2 = k50Var.f29994u0;
                                FloatBuffer floatBuffer3 = k50Var.f29997w0;
                                if (floatBuffer == null || floatBuffer2 == null) {
                                    FileLog.d("InstantCamera handleVideoFrameAvailable skip frame " + floatBuffer + " " + floatBuffer2);
                                } else {
                                    q40 q40Var = j50Var.f29620t0;
                                    int i26 = 36160;
                                    if (q40Var != null) {
                                        GLES20.glBindFramebuffer(36160, q40Var.f31788j[0]);
                                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, q40Var.f31789k[0], 0);
                                        GLES20.glViewport(0, 0, q40Var.f31781a, q40Var.f31782b);
                                    }
                                    GLES20.glUseProgram(j50Var.f29607i0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glVertexAttribPointer(j50Var.f29610l0, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                    GLES20.glEnableVertexAttribArray(j50Var.f29610l0);
                                    GLES20.glVertexAttribPointer(j50Var.m0, 2, 5126, false, 8, (Buffer) floatBuffer);
                                    GLES20.glEnableVertexAttribArray(j50Var.m0);
                                    GLES20.glUniformMatrix4fv(j50Var.f29608j0, 1, false, j50Var.D0.f29990r0, 0);
                                    GLES20.glUniform2f(j50Var.f29612n0, j50Var.d, j50Var.f29601e);
                                    k50 k50Var2 = j50Var.D0;
                                    if (k50Var2.Q[0] == 0 || floatBuffer3 == null || k50Var2.f29983l0) {
                                        i10 = 36197;
                                        i11 = 33984;
                                    } else {
                                        if (!j50Var.f29611n) {
                                            GLES20.glEnable(3042);
                                            j50Var.f29611n = true;
                                        }
                                        Size size5 = j50Var.D0.f30002z0;
                                        if (size5 != null) {
                                            i11 = 33984;
                                            GLES20.glUniform2f(j50Var.f29613o0, size5.getWidth(), j50Var.D0.f30002z0.getHeight());
                                        } else {
                                            i11 = 33984;
                                        }
                                        GLES20.glVertexAttribPointer(j50Var.m0, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                        GLES20.glUniformMatrix4fv(j50Var.f29609k0, 1, false, j50Var.D0.f29993t0, 0);
                                        GLES20.glUniform1f(j50Var.f29615q0, 1.0f);
                                        GLES20.glBindTexture(36197, j50Var.D0.Q[0]);
                                        i10 = 36197;
                                        GLES20.glDrawArrays(5, 0, 4);
                                    }
                                    k50 k50Var3 = j50Var.D0;
                                    Size[] sizeArr = k50Var3.f29975e0;
                                    if (sizeArr != null) {
                                        int i27 = j50Var.f29613o0;
                                        float width = sizeArr[k50Var3.W0].getWidth();
                                        k50 k50Var4 = j50Var.D0;
                                        GLES20.glUniform2f(i27, width, k50Var4.f29975e0[k50Var4.W0].getHeight());
                                        int i28 = j50Var.f29614p0;
                                        k50 k50Var5 = j50Var.D0;
                                        float width2 = (1.0f / k50Var5.f29975e0[k50Var5.W0].getWidth()) / 2.0f;
                                        k50 k50Var6 = j50Var.D0;
                                        GLES20.glUniform2f(i28, width2, (1.0f / k50Var6.f29975e0[k50Var6.W0].getHeight()) / 2.0f);
                                    }
                                    k50 k50Var7 = j50Var.D0;
                                    int i29 = k50Var7.P[k50Var7.W0];
                                    if (i29 != Integer.MIN_VALUE) {
                                        i12 = 0;
                                        GLES20.glUniformMatrix4fv(j50Var.f29609k0, 1, false, j50Var.D0.f29992s0, 0);
                                        GLES20.glUniform1f(j50Var.f29615q0, j50Var.D0.R);
                                        GLES20.glBindTexture(i10, i29);
                                        GLES20.glDrawArrays(5, 0, 4);
                                    } else {
                                        i12 = 0;
                                    }
                                    GLES20.glDisableVertexAttribArray(j50Var.f29610l0);
                                    GLES20.glDisableVertexAttribArray(j50Var.m0);
                                    GLES20.glBindTexture(i10, i12);
                                    GLES20.glUseProgram(i12);
                                    q40 q40Var2 = j50Var.f29620t0;
                                    if (q40Var2 != null) {
                                        GLES20.glDisable(3042);
                                        p40 p40Var = q40Var2.f31783c;
                                        int[] iArr = q40Var2.f31789k;
                                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                        GLES20.glViewport(i12, i12, 48, 48);
                                        GLES20.glUseProgram(p40Var.f31497a);
                                        int i30 = p40Var.d;
                                        f10 = 1.0f;
                                        FloatBuffer floatBuffer4 = q40Var2.f31786g;
                                        GLES20.glVertexAttribPointer(i30, 3, 5126, false, 12, floatBuffer4.position(i12));
                                        int i31 = p40Var.d;
                                        GLES20.glEnableVertexAttribArray(i31);
                                        int i32 = p40Var.f31500e;
                                        FloatBuffer floatBuffer5 = q40Var2.h;
                                        GLES20.glVertexAttribPointer(i32, 2, 5126, false, 8, floatBuffer5.position(i12));
                                        int i33 = p40Var.f31500e;
                                        GLES20.glEnableVertexAttribArray(i33);
                                        GLES20.glActiveTexture(i11);
                                        GLES20.glBindTexture(3553, iArr[i12]);
                                        GLES20.glUniform1i(p40Var.f31501f, i12);
                                        GLES20.glDrawArrays(5, i12, 4);
                                        GLES20.glBindTexture(3553, i12);
                                        GLES20.glDisableVertexAttribArray(i33);
                                        GLES20.glDisableVertexAttribArray(i31);
                                        GLES20.glUseProgram(i12);
                                        int i34 = 0;
                                        while (i34 < i14) {
                                            n40 n40Var = q40Var2.f31784e;
                                            GLES20.glFramebufferTexture2D(i26, 36064, 3553, iArr[i34 == 0 ? (char) 2 : (char) 1], i12);
                                            GLES20.glViewport(i12, i12, 48, 48);
                                            int i35 = n40Var.f31497a;
                                            int i36 = n40Var.f31500e;
                                            int i37 = n40Var.d;
                                            GLES20.glUseProgram(i35);
                                            GLES20.glVertexAttribPointer(n40Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                            GLES20.glEnableVertexAttribArray(i37);
                                            GLES20.glVertexAttribPointer(n40Var.f31500e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                            GLES20.glEnableVertexAttribArray(i36);
                                            GLES20.glActiveTexture(i11);
                                            GLES20.glBindTexture(3553, iArr[i34 == 0 ? (char) 1 : (char) 2]);
                                            i12 = 0;
                                            GLES20.glUniform1i(n40Var.f31501f, 0);
                                            GLES20.glUniform2f(n40Var.f30836g, i34 == 0 ? 0.020833334f : 0.0f, i34 == 1 ? 0.020833334f : 0.0f);
                                            GLES20.glDrawArrays(5, 0, 4);
                                            GLES20.glBindTexture(3553, 0);
                                            GLES20.glDisableVertexAttribArray(i36);
                                            GLES20.glDisableVertexAttribArray(i37);
                                            GLES20.glUseProgram(0);
                                            i34++;
                                            i14 = 2;
                                            i26 = 36160;
                                        }
                                        o40 o40Var = q40Var2.f31785f;
                                        GLES20.glBindFramebuffer(36160, i12);
                                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], i12);
                                        GLES20.glViewport(i12, i12, q40Var2.f31781a, q40Var2.f31782b);
                                        GLES20.glUseProgram(o40Var.f31497a);
                                        GLES20.glVertexAttribPointer(o40Var.d, 3, 5126, false, 12, floatBuffer4.position(i12));
                                        GLES20.glEnableVertexAttribArray(o40Var.d);
                                        GLES20.glVertexAttribPointer(o40Var.f31500e, 2, 5126, false, 8, floatBuffer5.position(i12));
                                        GLES20.glEnableVertexAttribArray(o40Var.f31500e);
                                        GLES20.glActiveTexture(33985);
                                        GLES20.glBindTexture(3553, iArr[1]);
                                        GLES20.glActiveTexture(i11);
                                        GLES20.glBindTexture(3553, iArr[0]);
                                        GLES20.glUniform1i(o40Var.f31501f, 0);
                                        GLES20.glUniform1i(o40Var.f31153g, 1);
                                        GLES20.glUniform2f(o40Var.h, q40Var2.f31781a / 2.0f, q40Var2.f31782b / 2.0f);
                                        GLES20.glDrawArrays(5, 0, 4);
                                        GLES20.glActiveTexture(33985);
                                        GLES20.glBindTexture(3553, 0);
                                        GLES20.glActiveTexture(i11);
                                        GLES20.glBindTexture(3553, 0);
                                        GLES20.glDisableVertexAttribArray(o40Var.f31500e);
                                        GLES20.glDisableVertexAttribArray(o40Var.d);
                                        GLES20.glUseProgram(0);
                                        p40 p40Var2 = q40Var2.d;
                                        GLES20.glEnable(3042);
                                        int i38 = p40Var2.f31497a;
                                        int i39 = p40Var2.f31500e;
                                        int i40 = p40Var2.d;
                                        GLES20.glUseProgram(i38);
                                        GLES20.glActiveTexture(i11);
                                        for (int i41 = 0; i41 < 2; i41++) {
                                            if (i41 == 0) {
                                                GLES20.glVertexAttribPointer(p40Var2.d, 3, 5126, false, 12, floatBuffer4.position(12));
                                                GLES20.glEnableVertexAttribArray(i40);
                                                GLES20.glVertexAttribPointer(p40Var2.f31500e, 2, 5126, false, 8, floatBuffer5.position(8));
                                                GLES20.glEnableVertexAttribArray(i39);
                                                GLES20.glBindTexture(3553, iArr[3]);
                                                i13 = 4;
                                            } else {
                                                int i42 = q40Var2.f31787i;
                                                q40Var2.f31787i = i42 + 1;
                                                GLES20.glVertexAttribPointer(p40Var2.d, 3, 5126, false, 12, floatBuffer4.position(24));
                                                GLES20.glEnableVertexAttribArray(i40);
                                                GLES20.glVertexAttribPointer(p40Var2.f31500e, 2, 5126, false, 8, floatBuffer5.position(((i42 % 27) * 8) + 16));
                                                GLES20.glEnableVertexAttribArray(i39);
                                                i13 = 4;
                                                GLES20.glBindTexture(3553, iArr[4]);
                                            }
                                            GLES20.glUniform1i(p40Var2.f31501f, 0);
                                            GLES20.glDrawArrays(5, 0, i13);
                                            GLES20.glBindTexture(3553, 0);
                                            GLES20.glDisableVertexAttribArray(i39);
                                            GLES20.glDisableVertexAttribArray(i40);
                                        }
                                        GLES20.glUseProgram(0);
                                        GLES20.glDisable(3042);
                                        if (j50Var.f29611n) {
                                            GLES20.glEnable(3042);
                                        }
                                    } else {
                                        f10 = 1.0f;
                                    }
                                    EGLExt.eglPresentationTimeANDROID(j50Var.f29618s, j50Var.f29627y, j50Var.N);
                                    EGL14.eglSwapBuffers(j50Var.f29618s, j50Var.f29627y);
                                    if (j50Var.f29626x0 != null && SharedConfig.getDevicePerformanceClass() == 2 && j50Var.f29628y0 % 33 == 0) {
                                        j50Var.f29626x0.postRunnable(new i3(j50Var, 21));
                                    }
                                    j50Var.f29628y0++;
                                    k50 k50Var8 = j50Var.D0;
                                    if (k50Var8.Q[0] != 0) {
                                        float f11 = k50Var8.R;
                                        if (f11 < f10 && !k50Var8.f29983l0) {
                                            float f12 = (j11 / 2.0E8f) + f11;
                                            k50Var8.R = f12;
                                            if (f12 > f10) {
                                                GLES20.glDisable(3042);
                                                j50Var.f29611n = false;
                                                k50 k50Var9 = j50Var.D0;
                                                k50Var9.R = 1.0f;
                                                GLES20.glDeleteTextures(1, k50Var9.Q, 0);
                                                k50 k50Var10 = j50Var.D0;
                                                k50Var10.Q[0] = 0;
                                                if (!k50Var10.B) {
                                                    j50Var.D0.B = true;
                                                    AndroidUtilities.runOnUIThread(new g50(j50Var, 6));
                                                }
                                            }
                                        }
                                    }
                                    if (!k50Var8.B) {
                                        j50Var.D0.B = true;
                                        AndroidUtilities.runOnUIThread(new g50(j50Var, 7));
                                    }
                                }
                                break;
                            }
                        } else if (i25 == 3) {
                            y40 y40Var = (y40) message.obj;
                            if (!j50Var.f29629z0 && !j50Var.f29606h0) {
                                j50Var.H.add(y40Var);
                                if (j50Var.f29600d0 != -1) {
                                    j12 = -1;
                                } else if (j50Var.Y == -1) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("InstantCamera video record not yet started");
                                    }
                                    break;
                                } else {
                                    while (true) {
                                        int i43 = 0;
                                        while (true) {
                                            if (i43 >= y40Var.d) {
                                                long j21 = j16;
                                                if (BuildVars.LOGS_ENABLED) {
                                                    i0.a.v(y40Var.d, new StringBuilder("InstantCamera first audio frame not found, removing buffers "));
                                                }
                                                j50Var.H.remove(y40Var);
                                                if (!j50Var.H.isEmpty()) {
                                                    y40Var = (y40) j50Var.H.get(0);
                                                    j16 = j21;
                                                }
                                                break;
                                            } else if (i43 != 0 || Math.abs(j50Var.Y - y40Var.f34804b[i43]) <= 10000000) {
                                                j12 = j16;
                                                long j22 = y40Var.f34804b[i43];
                                                if (j22 >= j50Var.Y) {
                                                    y40Var.f34806e = i43;
                                                    j50Var.f29600d0 = j22;
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        i0.a.y(i0.a.o(i43, "InstantCamera found first audio frame at ", " timestamp = "), y40Var.f34804b[i43]);
                                                    }
                                                } else {
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        i0.a.y(i0.a.o(i43, "InstantCamera ignore first audio frame at ", " timestamp = "), y40Var.f34804b[i43]);
                                                    }
                                                    i43++;
                                                    j16 = j12;
                                                }
                                            } else {
                                                long j23 = j50Var.Y;
                                                j12 = j16;
                                                long j24 = y40Var.f34804b[i43];
                                                j50Var.X = j23 - j24;
                                                j50Var.f29600d0 = j24;
                                                if (BuildVars.LOGS_ENABLED) {
                                                    i0.a.y(new StringBuilder("InstantCamera detected desync between audio and video "), j50Var.X);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (j50Var.L == j12) {
                                    j50Var.L = y40Var.f34804b[y40Var.f34806e];
                                }
                                if (j50Var.H.size() > 1) {
                                    y40Var = (y40) j50Var.H.get(0);
                                }
                                y40 y40Var2 = y40Var;
                                try {
                                    j50Var.e(false);
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                boolean z11 = false;
                                while (y40Var2 != null) {
                                    try {
                                        int iDequeueInputBuffer = j50Var.B.dequeueInputBuffer(j15);
                                        if (iDequeueInputBuffer >= 0) {
                                            ByteBuffer inputBuffer = j50Var.B.getInputBuffer(iDequeueInputBuffer);
                                            long[] jArr = y40Var2.f34804b;
                                            int i44 = y40Var2.f34806e;
                                            long j25 = jArr[i44];
                                            while (true) {
                                                int i45 = y40Var2.d;
                                                if (i44 <= i45) {
                                                    if (i44 < i45) {
                                                        j13 = j15;
                                                        long j26 = y40Var2.f34804b[i44] - j50Var.L;
                                                        if (j50Var.S) {
                                                            j14 = j25;
                                                        } else {
                                                            j14 = j25;
                                                            if (y40Var2.f34804b[i44] >= j50Var.Z - j50Var.X || j26 >= 60000000) {
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    if (j26 >= 60000000) {
                                                                        FileLog.d("InstantCamera stop audio encoding because recorded time more than 60s");
                                                                    } else {
                                                                        FileLog.d("InstantCamera stop audio encoding because of stoped video recording at " + y40Var2.f34804b[i44] + " last video " + j50Var.Z);
                                                                    }
                                                                }
                                                                j50Var.f29606h0 = true;
                                                                j50Var.H.clear();
                                                                y40Var2 = null;
                                                                z11 = true;
                                                            }
                                                        }
                                                        if (inputBuffer.remaining() < y40Var2.f34805c[i44]) {
                                                            y40Var2.f34806e = i44;
                                                        } else {
                                                            inputBuffer.put(y40Var2.f34803a[i44]);
                                                        }
                                                        y40Var2 = null;
                                                    } else {
                                                        j13 = j15;
                                                        j14 = j25;
                                                    }
                                                    if (i44 >= y40Var2.d - 1) {
                                                        j50Var.H.remove(y40Var2);
                                                        if (j50Var.S) {
                                                            j50Var.f29622v0.put(y40Var2);
                                                        }
                                                        if (j50Var.H.isEmpty()) {
                                                            z11 = y40Var2.f34807f;
                                                            y40Var2 = null;
                                                        } else {
                                                            y40Var2 = (y40) j50Var.H.get(0);
                                                        }
                                                    }
                                                    i44++;
                                                    j15 = j13;
                                                    j25 = j14;
                                                } else {
                                                    j13 = j15;
                                                    j14 = j25;
                                                }
                                            }
                                            long j27 = j14 == j13 ? j13 : j14 - j50Var.L;
                                            long j28 = j50Var.f29605g0;
                                            if (j28 >= j13) {
                                                j27 += j28;
                                            }
                                            long j29 = j27;
                                            j50Var.f29604f0 = j29 - j50Var.f29602e0;
                                            j50Var.f29602e0 = j29;
                                            j50Var.B.queueInputBuffer(iDequeueInputBuffer, 0, inputBuffer.position(), j29, z11 ? 4 : 0);
                                        } else {
                                            j13 = j15;
                                        }
                                        j15 = j13;
                                    } catch (Throwable th) {
                                        FileLog.e(th);
                                        return;
                                    }
                                }
                            }
                            break;
                        } else if (i25 == 4) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera pause encoder");
                            }
                            j50Var.f29629z0 = true;
                            File file = j50Var.D0.U;
                            if (file != null) {
                                file.delete();
                                j50Var.D0.U = null;
                            }
                            k50 k50Var11 = j50Var.D0;
                            k50Var11.U = z7.x(k50Var11.f29967a, true);
                            try {
                                FileLog.d("InstantCamera handlePauseRecording drain encoders");
                                j50Var.e(false);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            MP4Builder mP4Builder = j50Var.G;
                            if (mP4Builder != null) {
                                try {
                                    mP4Builder.finishMovie(j50Var.D0.U);
                                } catch (Exception e13) {
                                    FileLog.e(e13);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new g50(j50Var, i14));
                            break;
                        } else if (i25 == 5) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("InstantCamera resume encoder");
                            }
                            j50Var.f29629z0 = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public u0(r0 r0Var) {
        this.f2351a = 0;
        this.f2352b = new WeakReference(r0Var);
    }
}
