package k2;

import a8.ld;
import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import f9.s1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public abstract class a1 {
    public static final s1 f16116a = f9.i0.y(12);

    public static f9.i0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new g(0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && e2.n0.M(audioProfile.getFormat())) {
                for (int i10 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return f9.i0.u(treeSet);
    }

    public static f9.i0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        f9.i0 i0Var;
        int speakerLayoutChannelMask;
        boolean a2 = ld.a(audioDeviceInfo.getType());
        s1 s1Var = f16116a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return f9.i0.y(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return f9.i0.y(Integer.valueOf(speakerLayoutChannelMask));
                }
                e2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return s1Var;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && audioDeviceInfo.getType() == 10) {
                f9.i0 a10 = a(audioDeviceInfo);
                if (!a10.isEmpty()) {
                    return a10;
                }
                f9.i0 c10 = ag.t0.c(audioDeviceInfo.getAudioDescriptors());
                if (!c10.isEmpty()) {
                    return c10;
                }
            } else {
                if (i10 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i10 >= 31 && type2 == 29) {
                        f9.i0 a11 = a(audioDeviceInfo);
                        if (!a11.isEmpty()) {
                            return a11;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i10 >= 34) {
                            if (i10 >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor e = jh.l.e(audioDescriptor);
                                    if (e.getStandard() == 2) {
                                        byte[] descriptor = e.getDescriptor();
                                        if (descriptor.length != 3) {
                                            e2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            int i11 = 0;
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b10 = descriptor[0];
                                                if ((b10 & 1) != 0) {
                                                    i11 = 12;
                                                }
                                                if ((b10 & 2) != 0) {
                                                    i11 |= 32;
                                                }
                                                if ((b10 & 4) != 0) {
                                                    i11 |= 16;
                                                }
                                                if ((b10 & 8) != 0) {
                                                    i11 |= 192;
                                                }
                                                if ((b10 & 16) != 0) {
                                                    i11 |= 1024;
                                                }
                                                if ((b10 & 32) != 0) {
                                                    i11 |= 768;
                                                }
                                                if ((b10 & 128) != 0) {
                                                    i11 |= 201326592;
                                                }
                                                byte b11 = descriptor[1];
                                                if ((b11 & 1) != 0) {
                                                    i11 |= 81920;
                                                }
                                                if ((b11 & 2) != 0) {
                                                    i11 |= 8192;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    i11 |= 32768;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    i11 |= 6144;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    i11 |= 33554432;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    i11 |= 262144;
                                                }
                                                if ((b11 & 64) != 0) {
                                                    i11 |= 6144;
                                                }
                                                if ((b11 & 128) != 0) {
                                                    i11 |= 3145728;
                                                }
                                                byte b12 = descriptor[2];
                                                if ((b12 & 1) != 0) {
                                                    i11 |= 655360;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    i11 = 8388608 | i11;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    i11 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(i11));
                                        }
                                    }
                                }
                                List.EL.sort(arrayList, new a4.d(25));
                                i0Var = f9.i0.u(arrayList);
                            } else {
                                f9.g0 g0Var = f9.i0.f10286b;
                                i0Var = s1.e;
                            }
                            if (!i0Var.isEmpty()) {
                                return i0Var;
                            }
                        }
                        f9.i0 c11 = ag.t0.c(audioDescriptors);
                        if (!c11.isEmpty()) {
                            return c11;
                        }
                    }
                }
                if (i10 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                    f9.i0 a12 = a(audioDeviceInfo);
                    if (!a12.isEmpty()) {
                        return a12;
                    }
                }
            }
        }
        return s1Var;
    }
}
