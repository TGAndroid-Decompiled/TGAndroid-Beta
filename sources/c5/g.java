package c5;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import hg.k0;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class g {
    public boolean f3877a;
    public Object f3878b;
    public Object f3879c;
    public Object d;
    public Object e = new h0(this, true);
    public Object f3880f = new h0(this, false);

    public g(Context context, q qVar, of.b bVar) {
        this.f3878b = context;
        this.f3879c = qVar;
        this.d = bVar;
    }

    public d9.i a(int i10) {
        d9.i iVar;
        d9.i iVar2;
        HashMap hashMap = (HashMap) this.f3879c;
        d9.i iVar3 = (d9.i) hashMap.get(Integer.valueOf(i10));
        if (iVar3 != null) {
            return iVar3;
        }
        final of.b bVar = (of.b) this.e;
        bVar.getClass();
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
                                            return p.e((Class) this, bVar);
                                        case 1:
                                            return p.e((Class) this, bVar);
                                        case 2:
                                            return p.e((Class) this, bVar);
                                        default:
                                            return new v0(bVar, (c3.m) ((c5.g) this).f3878b);
                                    }
                                }
                            };
                        } else {
                            throw new IllegalArgumentException(k0.h(i10, "Unrecognized contentType: "));
                        }
                    } else {
                        iVar = new i2.o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(u2.e0.class), 3);
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(u2.e0.class);
                    iVar2 = new d9.i() {
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
                                    return new v0(bVar, (c3.m) ((c5.g) asSubclass).f3878b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(u2.e0.class);
                iVar2 = new d9.i() {
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
                                return new v0(bVar, (c3.m) ((c5.g) asSubclass2).f3878b);
                        }
                    }
                };
            }
            iVar = iVar2;
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(u2.e0.class);
            iVar = new d9.i() {
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
                            return new v0(bVar, (c3.m) ((c5.g) asSubclass3).f3878b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i10), iVar);
        return iVar;
    }
}
