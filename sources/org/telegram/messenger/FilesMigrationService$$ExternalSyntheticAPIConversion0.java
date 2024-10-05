package org.telegram.messenger;

import j$.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FilesMigrationService$$ExternalSyntheticAPIConversion0 {
    public static Stream m(Path path) {
        return Stream.VivifiedWrapper.convert(Files.list(path));
    }
}
