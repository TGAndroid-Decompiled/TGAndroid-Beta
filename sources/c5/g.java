package c5;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class g {
    public boolean f4291a;
    public Object f4292b;
    public Object f4293c;
    public Object d;
    public Object e = new h0(this, true);
    public Object f4294f = new h0(this, false);

    public g(Context context, q qVar, n4.y yVar) {
        this.f4292b = context;
        this.f4293c = qVar;
        this.d = yVar;
    }

    public d9.i a(int i10) {
        d9.i iVar;
        d9.i iVar2;
        HashMap hashMap = (HashMap) this.f4293c;
        d9.i iVar3 = (d9.i) hashMap.get(Integer.valueOf(i10));
        if (iVar3 != null) {
            return iVar3;
        }
        final n4.y yVar = (n4.y) this.e;
        yVar.getClass();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            iVar = new d9.i() {
                                @Override
                                public final Object get() {
                                    switch (r3) {
                                        case 0:
                                            return q.e((Class) this, yVar);
                                        case 1:
                                            return q.e((Class) this, yVar);
                                        case 2:
                                            return q.e((Class) this, yVar);
                                        default:
                                            return new x0(yVar, (c3.m) ((c5.g) this).f4292b);
                                    }
                                }
                            };
                        } else {
                            throw new IllegalArgumentException(hc.b.j(i10, "Unrecognized contentType: "));
                        }
                    } else {
                        iVar = new i2.o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(u2.f0.class), 3);
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(u2.f0.class);
                    iVar2 = new d9.i() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return q.e((Class) asSubclass, yVar);
                                case 1:
                                    return q.e((Class) asSubclass, yVar);
                                case 2:
                                    return q.e((Class) asSubclass, yVar);
                                default:
                                    return new x0(yVar, (c3.m) ((c5.g) asSubclass).f4292b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(u2.f0.class);
                iVar2 = new d9.i() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return q.e((Class) asSubclass2, yVar);
                            case 1:
                                return q.e((Class) asSubclass2, yVar);
                            case 2:
                                return q.e((Class) asSubclass2, yVar);
                            default:
                                return new x0(yVar, (c3.m) ((c5.g) asSubclass2).f4292b);
                        }
                    }
                };
            }
            iVar = iVar2;
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(u2.f0.class);
            iVar = new d9.i() {
                @Override
                public final Object get() {
                    switch (r3) {
                        case 0:
                            return q.e((Class) asSubclass3, yVar);
                        case 1:
                            return q.e((Class) asSubclass3, yVar);
                        case 2:
                            return q.e((Class) asSubclass3, yVar);
                        default:
                            return new x0(yVar, (c3.m) ((c5.g) asSubclass3).f4292b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i10), iVar);
        return iVar;
    }
}
