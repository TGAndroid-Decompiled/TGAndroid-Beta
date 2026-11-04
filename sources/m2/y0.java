package m2;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import b8.ce;
import g9.s1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public abstract class y0 {
    public static final s1 f19048a = g9.i0.u(12);

    public static g9.i0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new fa.b(1))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && g2.n0.M(audioProfile.getFormat())) {
                for (int i3 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i3));
                }
            }
        }
        return g9.i0.q(treeSet);
    }

    public static g9.i0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        g9.i0 i0Var;
        int speakerLayoutChannelMask;
        boolean a10 = ce.a(audioDeviceInfo.getType());
        s1 s1Var = f19048a;
        if (!a10) {
            if (audioDeviceInfo.getType() == 1) {
                return g9.i0.u(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return g9.i0.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                g2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return s1Var;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31 && audioDeviceInfo.getType() == 10) {
                g9.i0 a11 = a(audioDeviceInfo);
                if (!a11.isEmpty()) {
                    return a11;
                }
                g9.i0 c2 = cg.n0.c(audioDeviceInfo.getAudioDescriptors());
                if (!c2.isEmpty()) {
                    return c2;
                }
            } else {
                if (i3 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i3 >= 31 && type2 == 29) {
                        g9.i0 a12 = a(audioDeviceInfo);
                        if (!a12.isEmpty()) {
                            return a12;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i3 >= 34) {
                            if (i3 >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor d = l2.d.d(audioDescriptor);
                                    if (d.getStandard() == 2) {
                                        byte[] descriptor = d.getDescriptor();
                                        if (descriptor.length != 3) {
                                            g2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            int i10 = 0;
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b10 = descriptor[0];
                                                if ((b10 & 1) != 0) {
                                                    i10 = 12;
                                                }
                                                if ((b10 & 2) != 0) {
                                                    i10 |= 32;
                                                }
                                                if ((b10 & 4) != 0) {
                                                    i10 |= 16;
                                                }
                                                if ((b10 & 8) != 0) {
                                                    i10 |= 192;
                                                }
                                                if ((b10 & 16) != 0) {
                                                    i10 |= 1024;
                                                }
                                                if ((b10 & 32) != 0) {
                                                    i10 |= 768;
                                                }
                                                if ((b10 & 128) != 0) {
                                                    i10 |= 201326592;
                                                }
                                                byte b11 = descriptor[1];
                                                if ((b11 & 1) != 0) {
                                                    i10 |= 81920;
                                                }
                                                if ((b11 & 2) != 0) {
                                                    i10 |= 8192;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    i10 |= 32768;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    i10 |= 6144;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    i10 |= 33554432;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    i10 |= 262144;
                                                }
                                                if ((b11 & 64) != 0) {
                                                    i10 |= 6144;
                                                }
                                                if ((b11 & 128) != 0) {
                                                    i10 |= 3145728;
                                                }
                                                byte b12 = descriptor[2];
                                                if ((b12 & 1) != 0) {
                                                    i10 |= 655360;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    i10 = 8388608 | i10;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    i10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(i10));
                                        }
                                    }
                                }
                                List.EL.sort(arrayList, new a3.u(27));
                                i0Var = g9.i0.q(arrayList);
                            } else {
                                g9.g0 g0Var = g9.i0.f12083b;
                                i0Var = s1.f12146e;
                            }
                            if (!i0Var.isEmpty()) {
                                return i0Var;
                            }
                        }
                        g9.i0 c10 = cg.n0.c(audioDescriptors);
                        if (!c10.isEmpty()) {
                            return c10;
                        }
                    }
                }
                if (i3 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i3 >= 31 && type == 22))) {
                    g9.i0 a13 = a(audioDeviceInfo);
                    if (!a13.isEmpty()) {
                        return a13;
                    }
                }
            }
        }
        return s1Var;
    }
}
