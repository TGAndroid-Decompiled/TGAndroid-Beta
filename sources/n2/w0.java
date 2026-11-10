package n2;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import c8.z9;
import h9.t1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public abstract class w0 {
    public static final t1 f20344a = h9.i0.u(12);

    public static h9.i0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new aa.l(2))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && h2.m0.M(audioProfile.getFormat())) {
                for (int i7 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i7));
                }
            }
        }
        return h9.i0.q(treeSet);
    }

    public static h9.i0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        h9.i0 i0Var;
        int speakerLayoutChannelMask;
        boolean a10 = z9.a(audioDeviceInfo.getType());
        t1 t1Var = f20344a;
        if (!a10) {
            if (audioDeviceInfo.getType() == 1) {
                return h9.i0.u(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return h9.i0.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                h2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return t1Var;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31 && audioDeviceInfo.getType() == 10) {
                h9.i0 a11 = a(audioDeviceInfo);
                if (!a11.isEmpty()) {
                    return a11;
                }
                h9.i0 c10 = bg.o0.c(audioDeviceInfo.getAudioDescriptors());
                if (!c10.isEmpty()) {
                    return c10;
                }
            } else {
                if (i7 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i7 >= 31 && type2 == 29) {
                        h9.i0 a12 = a(audioDeviceInfo);
                        if (!a12.isEmpty()) {
                            return a12;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i7 >= 34) {
                            if (i7 >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor a13 = m2.d.a(audioDescriptor);
                                    if (a13.getStandard() == 2) {
                                        byte[] descriptor = a13.getDescriptor();
                                        if (descriptor.length != 3) {
                                            h2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
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
                                List.EL.sort(arrayList, new jg.x(8));
                                i0Var = h9.i0.q(arrayList);
                            } else {
                                h9.g0 g0Var = h9.i0.f14331b;
                                i0Var = t1.f14399e;
                            }
                            if (!i0Var.isEmpty()) {
                                return i0Var;
                            }
                        }
                        h9.i0 c11 = bg.o0.c(audioDescriptors);
                        if (!c11.isEmpty()) {
                            return c11;
                        }
                    }
                }
                if (i7 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i7 >= 31 && type == 22))) {
                    h9.i0 a14 = a(audioDeviceInfo);
                    if (!a14.isEmpty()) {
                        return a14;
                    }
                }
            }
        }
        return t1Var;
    }
}
