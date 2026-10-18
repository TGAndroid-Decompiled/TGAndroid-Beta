package k2;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import e9.x1;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import v7.c9;
public abstract class z0 {
    public static final x1 f14863a = e9.n0.y(12);

    public static e9.n0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new f(0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && e2.m0.M(audioProfile.getFormat())) {
                for (int i10 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return e9.n0.u(treeSet);
    }

    public static e9.n0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        e9.n0 n0Var;
        int speakerLayoutChannelMask;
        boolean a2 = c9.a(audioDeviceInfo.getType());
        x1 x1Var = f14863a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return e9.n0.y(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return e9.n0.y(Integer.valueOf(speakerLayoutChannelMask));
                }
                e2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return x1Var;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && audioDeviceInfo.getType() == 10) {
                e9.n0 a10 = a(audioDeviceInfo);
                if (!a10.isEmpty()) {
                    return a10;
                }
                e9.n0 b10 = e0.e0.b(audioDeviceInfo.getAudioDescriptors());
                if (!b10.isEmpty()) {
                    return b10;
                }
            } else {
                if (i10 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i10 >= 31 && type2 == 29) {
                        e9.n0 a11 = a(audioDeviceInfo);
                        if (!a11.isEmpty()) {
                            return a11;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i10 >= 34) {
                            if (i10 >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor b11 = j2.e.b(audioDescriptor);
                                    if (b11.getStandard() == 2) {
                                        byte[] descriptor = b11.getDescriptor();
                                        if (descriptor.length != 3) {
                                            e2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            int i11 = 0;
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b12 = descriptor[0];
                                                if ((b12 & 1) != 0) {
                                                    i11 = 12;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    i11 |= 32;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    i11 |= 16;
                                                }
                                                if ((b12 & 8) != 0) {
                                                    i11 |= 192;
                                                }
                                                if ((b12 & 16) != 0) {
                                                    i11 |= 1024;
                                                }
                                                if ((b12 & 32) != 0) {
                                                    i11 |= 768;
                                                }
                                                if ((b12 & 128) != 0) {
                                                    i11 |= 201326592;
                                                }
                                                byte b13 = descriptor[1];
                                                if ((b13 & 1) != 0) {
                                                    i11 |= 81920;
                                                }
                                                if ((b13 & 2) != 0) {
                                                    i11 |= 8192;
                                                }
                                                if ((b13 & 4) != 0) {
                                                    i11 |= 32768;
                                                }
                                                if ((b13 & 8) != 0) {
                                                    i11 |= 6144;
                                                }
                                                if ((b13 & 16) != 0) {
                                                    i11 |= 33554432;
                                                }
                                                if ((b13 & 32) != 0) {
                                                    i11 |= 262144;
                                                }
                                                if ((b13 & 64) != 0) {
                                                    i11 |= 6144;
                                                }
                                                if ((b13 & 128) != 0) {
                                                    i11 |= 3145728;
                                                }
                                                byte b14 = descriptor[2];
                                                if ((b14 & 1) != 0) {
                                                    i11 |= 655360;
                                                }
                                                if ((b14 & 2) != 0) {
                                                    i11 = 8388608 | i11;
                                                }
                                                if ((b14 & 4) != 0) {
                                                    i11 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(i11));
                                        }
                                    }
                                }
                                List.EL.sort(arrayList, new a4.d(25));
                                n0Var = e9.n0.u(arrayList);
                            } else {
                                e9.l0 l0Var = e9.n0.f8475b;
                                n0Var = x1.e;
                            }
                            if (!n0Var.isEmpty()) {
                                return n0Var;
                            }
                        }
                        e9.n0 b15 = e0.e0.b(audioDescriptors);
                        if (!b15.isEmpty()) {
                            return b15;
                        }
                    }
                }
                if (i10 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                    e9.n0 a12 = a(audioDeviceInfo);
                    if (!a12.isEmpty()) {
                        return a12;
                    }
                }
            }
        }
        return x1Var;
    }
}
