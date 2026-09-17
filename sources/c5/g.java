package c5;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class g {
    public boolean f4378a;
    public Object f4379b;
    public Object f4380c;
    public Object d;
    public Object f4381e = new h0(this, true);
    public Object f4382f = new h0(this, false);

    public g(Context context, q qVar, pf.b bVar) {
        this.f4379b = context;
        this.f4380c = qVar;
        this.d = bVar;
    }

    public d9.j a(int i10) {
        d9.j jVar;
        d9.j jVar2;
        HashMap hashMap = (HashMap) this.f4380c;
        d9.j jVar3 = (d9.j) hashMap.get(Integer.valueOf(i10));
        if (jVar3 != null) {
            return jVar3;
        }
        final pf.b bVar = (pf.b) this.f4381e;
        bVar.getClass();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            jVar = new d9.j() {
                                @Override
                                public final Object get() {
                                    switch (r3) {
                                        case 0:
                                            return p.e((Class) this, bVar);
                                        case 1:
                                            return p.e((Class) this, bVar);
                                        case 2:
                                            return p.e((Class) this, bVar);
                                        default:
                                            return new v0(bVar, (c3.m) ((c5.g) this).f4379b);
                                    }
                                }
                            };
                        } else {
                            throw new IllegalArgumentException(i2.g.i(i10, "Unrecognized contentType: "));
                        }
                    } else {
                        jVar = new i2.p(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(u2.e0.class), 3);
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(u2.e0.class);
                    jVar2 = new d9.j() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return p.e((Class) asSubclass, bVar);
                                case 1:
                                    return p.e((Class) asSubclass, bVar);
                                case 2:
                                    return p.e((Class) asSubclass, bVar);
                                default:
                                    return new v0(bVar, (c3.m) ((c5.g) asSubclass).f4379b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(u2.e0.class);
                jVar2 = new d9.j() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return p.e((Class) asSubclass2, bVar);
                            case 1:
                                return p.e((Class) asSubclass2, bVar);
                            case 2:
                                return p.e((Class) asSubclass2, bVar);
                            default:
                                return new v0(bVar, (c3.m) ((c5.g) asSubclass2).f4379b);
                        }
                    }
                };
            }
            jVar = jVar2;
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(u2.e0.class);
            jVar = new d9.j() {
                @Override
                public final Object get() {
                    switch (r3) {
                        case 0:
                            return p.e((Class) asSubclass3, bVar);
                        case 1:
                            return p.e((Class) asSubclass3, bVar);
                        case 2:
                            return p.e((Class) asSubclass3, bVar);
                        default:
                            return new v0(bVar, (c3.m) ((c5.g) asSubclass3).f4379b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i10), jVar);
        return jVar;
    }
}
