package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public abstract class noa {
    public static final j99 a = po5.u(12);

    public static po5 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new yz((byte) 0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && gcc.N(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return po5.q(treeSet);
    }

    public static po5 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        po5 po5Var;
        int speakerLayoutChannelMask;
        boolean a2 = eie.a(audioDeviceInfo.getType());
        j99 j99Var = a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return po5.u(4);
            }
            int type2 = audioDeviceInfo.getType();
            int i = Build.VERSION.SDK_INT;
            if (type2 == 2) {
                if (i >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return po5.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                efd.f("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return j99Var;
            }
            if (i >= 31) {
                if (audioDeviceInfo.getType() == 10) {
                    po5 a3 = a(audioDeviceInfo);
                    if (!a3.isEmpty()) {
                        return a3;
                    }
                    po5 l = zz.l(audioDeviceInfo.getAudioDescriptors());
                    if (!l.isEmpty()) {
                        return l;
                    }
                } else {
                    int type3 = audioDeviceInfo.getType();
                    if (i >= 31 && type3 == 29) {
                        po5 a4 = a(audioDeviceInfo);
                        if (!a4.isEmpty()) {
                            return a4;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor a5 = xz.a(audioDescriptor);
                                    if (a5.getStandard() == 2) {
                                        byte[] descriptor = a5.getDescriptor();
                                        if (descriptor.length != 3) {
                                            efd.f("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            int i2 = 0;
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b = descriptor[0];
                                                if ((b & 1) != 0) {
                                                    i2 = 12;
                                                }
                                                if ((b & 2) != 0) {
                                                    i2 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    i2 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    i2 |= 192;
                                                }
                                                if ((b & 16) != 0) {
                                                    i2 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    i2 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    i2 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    i2 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    i2 |= 8192;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    i2 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    i2 |= 6144;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    i2 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    i2 |= 262144;
                                                }
                                                if ((b2 & 64) != 0) {
                                                    i2 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    i2 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    i2 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    i2 |= 8388608;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    i2 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(i2));
                                        }
                                    }
                                }
                                List.EL.sort(arrayList, new ta((byte) 3));
                                po5Var = po5.q(arrayList);
                            } else {
                                no5 no5Var = po5.b;
                                po5Var = j99.e;
                            }
                            if (!po5Var.isEmpty()) {
                                return po5Var;
                            }
                        }
                        po5 l2 = zz.l(audioDescriptors);
                        if (!l2.isEmpty()) {
                            return l2;
                        }
                    }
                }
            }
            if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                po5 a6 = a(audioDeviceInfo);
                if (!a6.isEmpty()) {
                    return a6;
                }
            }
        }
        return j99Var;
    }
}
