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
public abstract class uma {
    public static final y79 a = mo5.u(12);

    public static mo5 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$EL.reversed(Comparator$CC.comparing(new x00((byte) 0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && hac.N(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return mo5.q(treeSet);
    }

    public static mo5 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        mo5 mo5Var;
        int speakerLayoutChannelMask;
        boolean a2 = ofe.a(audioDeviceInfo.getType());
        y79 y79Var = a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return mo5.u(4);
            }
            int type2 = audioDeviceInfo.getType();
            int i = Build.VERSION.SDK_INT;
            if (type2 == 2) {
                if (i >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return mo5.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                ncd.f("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return y79Var;
            }
            if (i >= 31) {
                if (audioDeviceInfo.getType() == 10) {
                    mo5 a3 = a(audioDeviceInfo);
                    if (!a3.isEmpty()) {
                        return a3;
                    }
                    mo5 l = y00.l(audioDeviceInfo.getAudioDescriptors());
                    if (!l.isEmpty()) {
                        return l;
                    }
                } else {
                    int type3 = audioDeviceInfo.getType();
                    if (i >= 31 && type3 == 29) {
                        mo5 a4 = a(audioDeviceInfo);
                        if (!a4.isEmpty()) {
                            return a4;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i >= 34 && audioDescriptors != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    AudioDescriptor a5 = w00.a(audioDescriptor);
                                    if (a5.getStandard() == 2) {
                                        byte[] descriptor = a5.getDescriptor();
                                        if (descriptor.length != 3) {
                                            ncd.f("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
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
                                List.EL.sort(arrayList, new sa((byte) 3));
                                mo5Var = mo5.q(arrayList);
                            } else {
                                ko5 ko5Var = mo5.b;
                                mo5Var = y79.e;
                            }
                            if (!mo5Var.isEmpty()) {
                                return mo5Var;
                            }
                        }
                        mo5 l2 = y00.l(audioDescriptors);
                        if (!l2.isEmpty()) {
                            return l2;
                        }
                    }
                }
            }
            if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                mo5 a6 = a(audioDeviceInfo);
                if (!a6.isEmpty()) {
                    return a6;
                }
            }
        }
        return y79Var;
    }
}
